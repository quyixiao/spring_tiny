package com.test41;

import java.security.PrivateKey;

public class User {

    private String userName;

    private Integer age;

    private Integer sex;

    public User() {
    }



    public User(Integer age, Integer sex) {
        this.age = age;
        this.sex = sex;
    }

    public User(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }




    public User(String userName, Integer age, Integer sex) {
        this.userName = userName;
        this.age = age;
        this.sex = sex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
