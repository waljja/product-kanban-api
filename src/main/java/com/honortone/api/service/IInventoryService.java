package com.honortone.api.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.honortone.commons.entity.Inventory;
import com.honortone.commons.entity.Product;
import com.honortone.commons.entity.Report;

import java.util.List;

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
     * 根据 时间 筛选（分页）
     *
     * @param page
     *        分页配置
     * @param queryWrapper
     *        条件构造器
     * @return
     */
    Page<Product> findByCreateDate(Page page, QueryWrapper queryWrapper);

    /**
     * 查找所有 成品库存 信息
     *
     * @param page
     *        分页配置
     * @param queryWrapper
     *        条件构造器
     * @return
     */
    Page<Product> findAll(Page page, QueryWrapper queryWrapper);

    /**
     * 查找今日数据（报表）
     *
     * @param queryWrapper
     *        条件构造器
     * @return
     */
    List<Report> findToday(QueryWrapper queryWrapper);
}
