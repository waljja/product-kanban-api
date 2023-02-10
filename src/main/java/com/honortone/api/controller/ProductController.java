package com.honortone.api.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.util.ListUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.honortone.api.mapper.InventoryMapper;
import com.honortone.api.service.ProductService;
import com.honortone.commons.entity.Product;
import com.honortone.commons.entity.Report;
import com.honortone.commons.result.CommonResult;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 成品入库看板 Controller
 *
 * @author 丁国钊
 * @date 2023-1-26
 */
@Slf4j
@Controller
@Api("成品入库看板接口")
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @Autowired
    InventoryMapper inventoryMapper;

    /**
     * 获取成品入库看板数据
     *
     * @param current
     *        当前页码
     * @param startDate
     *        开始日期
     * @param endDate
     *        结束日期
     * @return
     */
    @ResponseBody
    @GetMapping("/get-data")
    public CommonResult<Page<Product>> getProductData(@RequestParam(value = "current") int current,
                                                        @RequestParam(value = "startDate", required = false) String startDate,
                                                        @RequestParam(value = "endDate", required = false) String endDate) {
        Page<Product> inventoryList = productService.getPageList(current, startDate, endDate);

        return new CommonResult(200, "查询成功", inventoryList);
    }

    /**
     * 生成 Excel 报表
     *
     * @return
     */
    @ResponseBody
    @GetMapping (path = "/report/download")
    public void downloadProductReport(HttpServletResponse response) throws IOException {
        String d = "data";
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        // 报表文件名称
        String fileName = URLEncoder
                .encode("成品入库报表(" + format.format(date) + ")", "UTF-8")
                .replaceAll("\\+", "%20");
        response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setCharacterEncoding("utf-8");
        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
        EasyExcel.write(response.getOutputStream(), Report.class).sheet("成品入库报表模板").doWrite(data());
    }

    /**
     * 生成模板数据
     *
     * @return
     */
    private List<Report> data() {
        List<Report> list = ListUtils.newArrayList();
        for (int i = 0; i < 10; i++) {
            Report data = new Report();
            Date date = new Date();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            data.setItem(i);
            data.setPartNumber("641-");
            data.setWo("1623232");
            data.setBatch("000002");
            data.setUid("000001623232/B" + i);
            data.setPlant("1100");
            data.setQuantity(Double.valueOf(i) + 0.5);
            data.setState((short) 1);
            data.setStorageLoc("A001");
            data.setReceivingTime(format.format(date));
            data.setCreateUser("丁国钊");
            data.setCreateDate(format.format(date));
            list.add(data);
        }
        return list;
    }
}
