package com.honortone.commons.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.write.style.*;
import com.alibaba.excel.enums.poi.FillPatternTypeEnum;
import com.alibaba.excel.enums.poi.HorizontalAlignmentEnum;
import com.alibaba.excel.enums.poi.VerticalAlignmentEnum;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * 报表填充实体类
 *
 * @author 丁国钊
 * @date 2023-1-26
 */
@Setter
@Getter
@EqualsAndHashCode
@HeadRowHeight(30)
@ContentRowHeight(20)
@ContentStyle(horizontalAlignment = HorizontalAlignmentEnum.CENTER, verticalAlignment = VerticalAlignmentEnum.CENTER)
public class Report {
    @ExcelProperty({"序号"})
    @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 44)
    Integer item;

    @ColumnWidth(30)
    @ExcelProperty({"PartNumber"})
    @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 42)
    String partNumber;

    @ColumnWidth(20)
    @ExcelProperty({"工单"})
    @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 42)
    String wo;

    @ColumnWidth(15)
    @ExcelProperty({"批次号"})
    @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 42)
    String batch;

    @ColumnWidth(25)
    @ExcelProperty({"UID"})
    @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 42)
    private String uid;

    @ColumnWidth(15)
    @ExcelProperty({"工厂"})
    @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 47)
    private String plant;

    @ColumnWidth(15)
    @ExcelProperty({"数量"})
    @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 47)
    Double quantity;

    @ExcelProperty({"状态"})
    @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 47)
    Short state;

    @ColumnWidth(15)
    @ExcelProperty({"仓位"})
    @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 47)
    private String storageLoc;

    @ColumnWidth(25)
    @ExcelProperty({"收货时间"})
    @DateTimeFormat("yyyy-MM-dd HH:mm:ss")
    @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 47)
    private LocalDateTime recTime;

    @ColumnWidth(15)
    @ExcelProperty({"创建人"})
    @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 43)
    private String createUser;

    @ColumnWidth(25)
    @ExcelProperty({"创建时间"})
    @DateTimeFormat("yyyy-MM-dd HH:mm:ss")
    @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 43)
    private LocalDateTime createDate;
}
