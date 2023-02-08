package com.honortone.api.service;

import com.honortone.commons.entity.Inventory;

import java.util.List;

/**
 * 成品入库看板 service
 *
 * @author 丁国钊
 * @date 2023-2-8
 */
public interface ProductService {
    /**
     * 获取 成品库存表 分页数据逻辑处理
     *
     * @param current
     *        当前页码
     * @param startDate
     *        开始日期
     * @param endDate
     *        结束日期
     * @return
     */
    List<Inventory> getPageList(int current, String startDate, String endDate);
}
