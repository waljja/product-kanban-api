package com.honortone.api.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.honortone.api.service.IInventoryService;
import com.honortone.api.service.IReportFillService;
import com.honortone.commons.entity.Report;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * ReportFillServiceImpl
 *
 * @author 丁国钊
 * @date 2023-02-10-10:06
 */
@Slf4j
@Service
public class ReportFillServiceImpl implements IReportFillService {
    @Autowired
    IInventoryService inventoryService;

    @Override
    public List<Report> getFillData() {
        List<Report> reportList;
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String startTime = "2023-02-01" + " 00:00:00";
        String endTime = simpleDateFormat.format(date) + " 23:59:59";
        QueryWrapper<Report> queryWrapper = new QueryWrapper<>();
        queryWrapper
                .apply("CONVERT(VARCHAR(20),CreateDate,21) >= '" + startTime + "'")
                .apply("CONVERT(VARCHAR(20),CreateDate,21) <= '" + endTime + "'")
                .orderByAsc("WO", "CONVERT(int,Batch)");
        reportList = inventoryService.findToday(queryWrapper);

        return reportList;
    }
}
