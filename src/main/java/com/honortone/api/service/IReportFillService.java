package com.honortone.api.service;

import com.honortone.commons.entity.Report;

import java.util.List;

/**
 * IReportFillService
 *
 * @author 丁国钊
 * @date 2023-02-10-10:03
 */
public interface IReportFillService {
    /**
     * 获取报表填充数据
     *
     * @return
     */
    List<Report> getFillData();
}
