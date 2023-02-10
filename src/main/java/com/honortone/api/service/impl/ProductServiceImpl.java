package com.honortone.api.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.honortone.api.service.IInventoryService;
import com.honortone.api.service.ProductService;
import com.honortone.commons.entity.Inventory;
import com.honortone.commons.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 丁国钊
 * @date 2023-2-8
 */
@Slf4j
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    IInventoryService inventoryService;

    @Override
    public Page<Product> getPageList(int current, String startDate, String endDate) {
        Page<Product> inventoryPageList;
        // current -> 当前页码，每页 20 条数据
        Page inventoryPage = new Page(current, 20);
        // 开始日期非空
        boolean sNotNull = startDate != null;
        // 结束日期非空
        boolean eNoTNull = endDate != null;

        // 日期都不为空 -> 按时间范围查询
        if (sNotNull && eNoTNull) {
            startDate += " 00:00:00.000";
            endDate += " 23:59:59.999";
            QueryWrapper<Inventory> queryWrapper = new QueryWrapper<>();
            // 根据日期范围查询，SQL Server 分页必须有 order 排序
            queryWrapper
                    .apply("CONVERT(VARCHAR(20),CreateDate,21) >= '" + startDate + "'")
                    .apply("CONVERT(VARCHAR(20),CreateDate,21) <= '" + endDate + "'")
                    .orderByAsc("CreateDate");
            inventoryPageList = inventoryService.findByCreateDate(inventoryPage, queryWrapper);
        } else { // 有一个为空 -> 不按时间条件查询
            QueryWrapper queryWrapper = new QueryWrapper();
            queryWrapper.orderByAsc("CreateDate");
            inventoryPageList = inventoryService.findAll(inventoryPage, queryWrapper);
        }

        return inventoryPageList;
    }
}
