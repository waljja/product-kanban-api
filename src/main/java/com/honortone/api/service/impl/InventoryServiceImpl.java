package com.honortone.api.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.honortone.api.mapper.InventoryMapper;
import com.honortone.api.service.IInventoryService;
import com.honortone.commons.entity.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    InventoryMapper inventoryMapper;

    @Override
    public Page<Inventory> findByCreateDate(Page page, QueryWrapper queryWrapper) {
        return inventoryMapper.findByCreateDate(page, queryWrapper);
    }

    @Override
    public Page<Inventory> findAll(Page page) {
        return inventoryMapper.findAll(page);
    }
}
