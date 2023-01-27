package com.honortone.api.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.util.ListUtils;
import com.honortone.commons.entity.Report;
import com.honortone.commons.result.CommonResult;
import lombok.extern.slf4j.Slf4j;
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
 * 成品入库看板 API
 *
 * @author 丁国钊
 * @date 2023-1-26
 */
@Slf4j
@Controller
@RequestMapping(value = "/product")
public class ProductController {
    /**
     * 获取成品入库看板数据
     *
     * @param date
     *        前端筛选日期
     * @return
     */
    @GetMapping("/get-data")
    public CommonResult getProductData(@RequestParam(required = false) Date date) {
        String data = "data";
        return new CommonResult(200, "成功", data);
    }

    /**
     * 生成 Excel 报表
     *
     * @return
     */
    @ResponseBody
    @GetMapping (path = "/download/report")
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
            data.setNumber(i);
            data.setState(2);
            data.setPartNumber("641-");
            data.setBatchId("000002");
            data.setWo("1623232");
            data.setReceivingTime(format.format(date));
            list.add(data);
        }
        return list;
    }
}
