package com.honortone.commons.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 报表实体类
 *
 * @author 丁国钊
 * @date 2023-1-26
 */
@Setter
@Getter
@EqualsAndHashCode
public class Report {
    @ExcelProperty({"鸿通成品入库报表", "item"})
    Integer item;
    @ExcelProperty({"鸿通成品入库报表", "数量"})
    Integer number;
    @ExcelProperty({"鸿通成品入库报表", "状态"})
    Integer state;
    @ExcelProperty({"鸿通成品入库报表", "PartNumber"})
    String partNumber;
    @ExcelProperty({"鸿通成品入库报表", "批次号码"})
    String batchId;
    @ExcelProperty({"鸿通成品入库报表", "工单"})
    String wo;
    @ExcelProperty({"鸿通成品入库报表", "收货时间"})
    Date receivingTime;
}
