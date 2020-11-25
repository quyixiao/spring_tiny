package com.sina.model.entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
* <p>
* </p>*公益口罩
* @author quyixiao
* @since 2020-11-25
*/

@Data
@ApiModel(value = "公益口罩Dto")
public class UserDto {
    //
    @ApiModelProperty(value = "", name = "id")
    private Long id;
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

    @Override
    public String toString() {
        return "UserDto{" +
                ",id=" + id +
                ",username=" + username +
                ",password=" + password +
                ",realName=" + realName +
                ",managerId=" + managerId +
                "}";
    }
}