package com.honortone.commons.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

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
    private Integer quantity;

    @ApiModelProperty("库位号")
    private String stock;

    @ApiModelProperty("状态")
    private Integer status;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
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
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getWo() {
        return wo;
    }

    public void setWo(String wo) {
        this.wo = wo;
    }
    public LocalDateTime getRecTime() {
        return recTime;
    }

    public void setRecTime(LocalDateTime recTime) {
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
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
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
            ", createDate=" + createDate +
        "}";
    }
}
