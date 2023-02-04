package com.honortone.api.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.honortone.commons.entity.Inventory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
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
     * @return
     */
    Page<Inventory> findAll(Page<Inventory> page);
}
