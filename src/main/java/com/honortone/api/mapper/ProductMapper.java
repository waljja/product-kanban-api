package com.honortone.api.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.honortone.commons.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author 丁国钊
 * @date 2023-2-9
 */
@Mapper
@Repository
public interface ProductMapper {
    /**
     * 查找 成品库存表 所有数据
     *
     * @param page
     *        分页设置
     * @param queryWrapper
     *        条件构造器
     * @return
     */
    Page<Product> findByCreateDate(Page page, @Param("ew") QueryWrapper queryWrapper);

    /**
     * 查找所有 成品入库 数据
     *
     * @param page
     *        分页设置
     * @param queryWrapper
     *        条件构造器
     * @return
     */
    Page<Product> findAll(Page page, @Param("ew") QueryWrapper queryWrapper);
}
