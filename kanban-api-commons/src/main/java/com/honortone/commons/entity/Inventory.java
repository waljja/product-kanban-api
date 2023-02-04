package com.honortone.commons.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 成品库存表
 * </p>
 *
 * @author 丁国钊
 * @since 2023-02-04
 */
@TableName("FG_Inventory")
@ApiModel(value = "Inventory对象", description = "成品库存表")
public class Inventory implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    @ApiModelProperty("型号")
    private String partNumber;

    @ApiModelProperty("批次")
    private String batch;

    @ApiModelProperty("UID")
    private String uid;

    @ApiModelProperty("数量")
    private String quantity;

    @ApiModelProperty("库位号")
    private String stock;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("工单")
    private String wo;

    @ApiModelProperty("收货时间")
    private String recTime;

    @ApiModelProperty("工厂")
    private String plant;

    @ApiModelProperty("创建人")
    private String createUser;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getWo() {
        return wo;
    }

    public void setWo(String wo) {
        this.wo = wo;
    }
    public String getRecTime() {
        return recTime;
    }

    public void setRecTime(String recTime) {
        this.recTime = recTime;
    }
    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Inventory{" +
            "id=" + id +
            ", partNumber=" + partNumber +
            ", batch=" + batch +
            ", uid=" + uid +
            ", quantity=" + quantity +
            ", stock=" + stock +
            ", status=" + status +
            ", wo=" + wo +
            ", recTime=" + recTime +
            ", plant=" + plant +
            ", createUser=" + createUser +
            ", createTime=" + createTime +
        "}";
    }
}
