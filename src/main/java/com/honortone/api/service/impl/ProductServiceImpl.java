package com.honortone.api.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.honortone.api.service.IInventoryService;
import com.honortone.api.service.ProductService;
import com.honortone.commons.entity.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 丁国钊
 * @date 2023-2-8
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    IInventoryService inventoryService;

    @Override
    public List<Inventory> getPageList(int current, String startDate, String endDate) {
        List<Inventory> inventoryList;
        // current -> 当前页码，每页 20 条数据
        Page inventoryPage = new Page(current, 20);
        // 开始日期非空
        boolean sNotNull = startDate != null;
        // 结束日期非空
        boolean eNoTNull = endDate != null;

        // 日期都不为空 -> 按时间范围查询
        if (sNotNull && eNoTNull) {
            QueryWrapper<Inventory> queryWrapper = new QueryWrapper<>();
            // 根据日期范围查询，SQL Server 分页必须 排序
            queryWrapper
                    .apply("convert(VARCHAR(20),CreateDate,21) >= '" + startDate + "'")
                    .apply("convert(VARCHAR(20),CreateDate,21) <= '" + endDate + "'")
                    .orderByAsc("CreateDate");
            Page<Inventory> inventoryPageList = inventoryService.findByCreateDate(inventoryPage, queryWrapper);
            inventoryList = inventoryPageList.getRecords();
        } else { // 有一个为空 -> 不按时间条件查询
            Page<Inventory> inventoryPageList = inventoryService.findAll(inventoryPage);
            inventoryList = inventoryPageList.getRecords();
        }

        return inventoryList;
    }
}
