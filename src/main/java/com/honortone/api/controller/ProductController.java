package com.honortone.api.controller;

import com.honortone.commons.result.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

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
    @GetMapping CommonResult generateReport() {
        String data = "data";
        return new CommonResult(200, "成功", data);
    }
}
