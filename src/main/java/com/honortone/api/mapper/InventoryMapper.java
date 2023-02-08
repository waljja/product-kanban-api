package com.honortone.api.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.honortone.commons.entity.Inventory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 成品库存表 Mapper 接口
 * </p>
 *
 * @author 丁国钊
 * @since 2023-02-04
 */
@Mapper
@Repository
public interface InventoryMapper extends BaseMapper<Inventory> {
    /**
     * 查找 成品库存表 所有数据
     *
     * @param page
     *        分页设置
     * @param queryWrapper
     *        条件构造器
     * @return
     */
    Page<Inventory> findByCreateDate(Page page, @Param("ew") QueryWrapper queryWrapper);

    /**
     * 查找所有 成品入库 数据
     *
     * @param page
     *        分页设置
     * @return
     */
    Page<Inventory> findAll(Page page);
}
