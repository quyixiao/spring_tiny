package com.spring_101_200.test_171_180.test_175_tx_out_never_inner_required;

import lombok.Data;

import java.util.Date;


@Data
public class User {
    private Long id;
    private Integer isDelete;
    private Date gmtCreate;
    private Date gmtModified;
    private String username;
    private String password;
    private String realName;
    private Long managerId;

    public User() {
    }

    public User(Long id ,String username, String password) {
        this.id = id ;
        this.username = username;
        this.password = password;
    }


}
