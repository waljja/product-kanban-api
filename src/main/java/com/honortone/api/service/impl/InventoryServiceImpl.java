package com.honortone.api.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.honortone.api.mapper.InventoryMapper;
import com.honortone.api.mapper.ProductMapper;
import com.honortone.api.mapper.ReportMapper;
import com.honortone.api.service.IInventoryService;
import com.honortone.commons.entity.Inventory;
import com.honortone.commons.entity.Product;
import com.honortone.commons.entity.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 成品库存表 服务实现类
 * </p>
 *
 * @author 丁国钊
 * @since 2023-02-04
 */
@Service
public class InventoryServiceImpl extends ServiceImpl<InventoryMapper, Inventory> implements IInventoryService {
    @Autowired
    ProductMapper productMapper;
    @Autowired
    ReportMapper reportMapper;

    @Override
    public Page<Product> findByCreateDate(Page page, QueryWrapper queryWrapper) {
        return productMapper.findByCreateDate(page, queryWrapper);
    }

    @Override
    public Page<Product> findAll(Page page, QueryWrapper queryWrapper) {
        return productMapper.findAll(page, queryWrapper);
    }

    @Override
    public List<Report> findToday(QueryWrapper queryWrapper) {
        return reportMapper.findToday(queryWrapper);
    }
}
