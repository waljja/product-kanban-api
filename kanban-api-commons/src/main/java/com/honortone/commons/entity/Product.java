package com.honortone.commons.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 成品入库看板 前端表格实体类
 *
 * @author 丁国钊
 * @date 2023-2-9
 */
@Setter
@Getter
@ApiModel(value = "Product对象", description = "")
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;

    @ApiModelProperty("序号")
    private Integer item;

    @ApiModelProperty("型号")
    private String partNumber;

    @ApiModelProperty("批次")
    private String batch;

    @ApiModelProperty("UID")
    private String uid;

    @ApiModelProperty("数量")
    private Integer quantity;

    @ApiModelProperty("库位号")
    private String storageLoc;

    @ApiModelProperty("状态")
    private Integer state;

    @ApiModelProperty("工单")
    private String wo;

    @ApiModelProperty("收货时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="Asia/Shanghai")
    private LocalDateTime recTime;

    @ApiModelProperty("工厂")
    private String plant;

    @ApiModelProperty("创建人")
    private String createUser;

    @ApiModelProperty("创建时间")
    private LocalDateTime createDate;
}
