package com.honortone.commons.service;

import com.honortone.commons.entity.Inventory;
import com.honortone.commons.result.CommonResult;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

/**
 * Dubbo RPC 调用服务接口
 *
 * @author 丁国钊
 * @date 2023-2-4
 */
public interface DubboApiService {
    /**
     * 获取成品数据
     *
     * @param date
     *        筛选日期
     * @return
     */
    CommonResult<Inventory> getProductData(@Param("date") Date date);
}

