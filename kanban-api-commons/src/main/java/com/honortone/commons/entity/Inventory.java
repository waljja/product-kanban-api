package com.honortone.commons.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author 丁国钊
 * @since 2023-02-07
 */
@Setter
@Getter
@ToString
@TableName("FG_Inventory")
@ApiModel(value = "Inventory对象", description = "")
public class Inventory implements Serializable {

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
    private Double quantity;

    @ApiModelProperty("库位号")
    private String stock;

    @ApiModelProperty("状态")
    private Short status;

    @ApiModelProperty("工单")
    private String wo;

    @ApiModelProperty("收货时间")
    private LocalDateTime recTime;

    @ApiModelProperty("工厂")
    private String plant;

    @ApiModelProperty("创建人")
    private String createUser;

    @ApiModelProperty("创建时间")
    private LocalDateTime createDate;

}
