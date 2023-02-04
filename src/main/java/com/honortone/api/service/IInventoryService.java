package com.honortone.api.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.honortone.commons.entity.Inventory;

/**
 * <p>
 * 成品库存表 服务类
 * </p>
 *
 * @author 丁国钊
 * @since 2023-02-04
 */
public interface IInventoryService extends IService<Inventory> {
    /**
     * 根据 时间 筛选
     *
     * @param page
     * @return
     */
    Page<Inventory> findByCreateTime(Page<Inventory> page);
}
