package com.honortone.api.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.honortone.commons.entity.Report;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ReportMapper
 *
 * @author 丁国钊
 * @date 2023-02-10-10:34
 */
@Mapper
@Repository
public interface ReportMapper {
    /**
     * 查找报表数据
     *
     * @param queryWrapper
     *        条件构造器
     * @return
     */
    List<Report> findToday(@Param("ew") QueryWrapper queryWrapper);
}
