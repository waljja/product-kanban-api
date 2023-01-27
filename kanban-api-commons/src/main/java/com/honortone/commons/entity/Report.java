package com.honortone.commons.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.HeadStyle;
import com.alibaba.excel.enums.poi.FillPatternTypeEnum;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

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
    @ExcelProperty({"item"})
    @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 44)
    Integer item;
    @ExcelProperty({"数量"})
    @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 44)
    Integer number;
    @ExcelProperty({"状态"})
    @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 44)
    Integer state;
    @ExcelProperty({"PartNumber"})
    @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 42)
    String partNumber;
    @ExcelProperty({"批次号码"})
    @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 42)
    String batchId;
    @ExcelProperty({"工单"})
    @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 47)
    String wo;
    @ExcelProperty({"收货时间"})
    @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 47)
    String receivingTime;
}
