package com.sina.model.entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
* <p>
* </p>*公益口罩
* @author quyixiao
* @since 2020-12-21
*/

@Data
@ApiModel(value = "公益口罩Dto")
public class UserBillDto {
    //
    @ApiModelProperty(value = "", name = "id")
    private Long id;
    //收支类型
    @ApiModelProperty(value = "收支类型", name = "type")
    private String type;
    //用户id
    @ApiModelProperty(value = "用户id", name = "userId")
    private Long userId;
    //管理员id
    @ApiModelProperty(value = "管理员id", name = "managerId")
    private Long managerId;
    //
    @ApiModelProperty(value = "", name = "amount")
    private BigDecimal amount;
    //备注
    @ApiModelProperty(value = "备注", name = "remark")
    private String remark;
    //账单类型
    @ApiModelProperty(value = "账单类型", name = "billType")
    private String billType;
    //支付方式
    @ApiModelProperty(value = "支付方式", name = "payType")
    private String payType;
    //-1表示作费，0表示提交，1表示已经报销
    @ApiModelProperty(value = "-1表示作费，0表示提交，1表示已经报销", name = "status")
    private Integer status;
    //0表示公开，1表示仅仅自己可见
    @ApiModelProperty(value = "0表示公开，1表示仅仅自己可见", name = "selfLook")
    private Integer selfLook;
    /**
     *  
     * @return
     */
    public Long getId() {
        return id;
    }
    /**
     *  
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 收支类型 
     * @return
     */
    public String getType() {
        return type;
    }
    /**
     * 收支类型 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 用户id 
     * @return
     */
    public Long getUserId() {
        return userId;
    }
    /**
     * 用户id 
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 管理员id 
     * @return
     */
    public Long getManagerId() {
        return managerId;
    }
    /**
     * 管理员id 
     * @param managerId
     */
    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    /**
     *  
     * @return
     */
    public BigDecimal getAmount() {
        return amount;
    }
    /**
     *  
     * @param amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 备注 
     * @return
     */
    public String getRemark() {
        return remark;
    }
    /**
     * 备注 
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 账单类型 
     * @return
     */
    public String getBillType() {
        return billType;
    }
    /**
     * 账单类型 
     * @param billType
     */
    public void setBillType(String billType) {
        this.billType = billType;
    }

    /**
     * 支付方式 
     * @return
     */
    public String getPayType() {
        return payType;
    }
    /**
     * 支付方式 
     * @param payType
     */
    public void setPayType(String payType) {
        this.payType = payType;
    }

    /**
     * -1表示作费，0表示提交，1表示已经报销 
     * @return
     */
    public Integer getStatus() {
        return status;
    }
    /**
     * -1表示作费，0表示提交，1表示已经报销 
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 0表示公开，1表示仅仅自己可见 
     * @return
     */
    public Integer getSelfLook() {
        return selfLook;
    }
    /**
     * 0表示公开，1表示仅仅自己可见 
     * @param selfLook
     */
    public void setSelfLook(Integer selfLook) {
        this.selfLook = selfLook;
    }

    @Override
    public String toString() {
        return "UserBillDto{" +
                ",id=" + id +
                ",type=" + type +
                ",userId=" + userId +
                ",managerId=" + managerId +
                ",amount=" + amount +
                ",remark=" + remark +
                ",billType=" + billType +
                ",payType=" + payType +
                ",status=" + status +
                ",selfLook=" + selfLook +
                "}";
    }
}