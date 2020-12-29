package com.spring_101_200.test_181_190.test_185_spring_mvc;

import lombok.Data;

@Data
public class User {
    private String username;
    private Integer age;

    public User() {
    }

    public User(String username, Integer age) {
        this.username = username;
        this.age = age;
    }
}


