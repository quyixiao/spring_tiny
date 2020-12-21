package com.sina.model.entity;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.util.Date;
/**
* <p>
* </p>*公益口罩
* @author quyixiao
* @since 2020-12-21
*/

@Data
@TableName("lz_user")
@ApiModel(value = "公益口罩")
public class User2 implements java.io.Serializable {
    //
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    //
    @ApiModelProperty(value = "", name = "isDelete")
    private Integer isDelete;
    //创建时间
    @ApiModelProperty(value = "创建时间", name = "gmtCreate")
    private Date gmtCreate;
    //
    @ApiModelProperty(value = "", name = "gmtModified")
    private Date gmtModified;
    //用户名
    @ApiModelProperty(value = "用户名", name = "username")
    private String username;
    //密码
    @ApiModelProperty(value = "密码", name = "password")
    private String password;
    //
    @ApiModelProperty(value = "", name = "realName")
    private String realName;
    //管理员id
    @ApiModelProperty(value = "管理员id", name = "managerId")
    private Long managerId;
    //性别
    @ApiModelProperty(value = "性别", name = "sex")
    private Integer sex;
    //
    @ApiModelProperty(value = "", name = "sexStr")
    private String sexStr;
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
     *  
     * @return
     */
    public Integer getIsDelete() {
        return isDelete;
    }
    /**
     *  
     * @param isDelete
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 创建时间 
     * @return
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }
    /**
     * 创建时间 
     * @param gmtCreate
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     *  
     * @return
     */
    public Date getGmtModified() {
        return gmtModified;
    }
    /**
     *  
     * @param gmtModified
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * 用户名 
     * @return
     */
    public String getUsername() {
        return username;
    }
    /**
     * 用户名 
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 密码 
     * @return
     */
    public String getPassword() {
        return password;
    }
    /**
     * 密码 
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *  
     * @return
     */
    public String getRealName() {
        return realName;
    }
    /**
     *  
     * @param realName
     */
    public void setRealName(String realName) {
        this.realName = realName;
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
     * 性别 
     * @return
     */
    public Integer getSex() {
        return sex;
    }
    /**
     * 性别 
     * @param sex
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     *  
     * @return
     */
    public String getSexStr() {
        return sexStr;
    }
    /**
     *  
     * @param sexStr
     */
    public void setSexStr(String sexStr) {
        this.sexStr = sexStr;
    }

    @Override
    public String toString() {
        return "User{" +
                ",id=" + id +
                ",isDelete=" + isDelete +
                ",gmtCreate=" + gmtCreate +
                ",gmtModified=" + gmtModified +
                ",username=" + username +
                ",password=" + password +
                ",realName=" + realName +
                ",managerId=" + managerId +
                ",sex=" + sex +
                ",sexStr=" + sexStr +
                "}";
    }
}