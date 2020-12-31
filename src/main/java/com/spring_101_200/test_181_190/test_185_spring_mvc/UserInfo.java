package com.spring_101_200.test_181_190.test_185_spring_mvc;

import lombok.Data;

import java.io.Serializable;


@Data
public class UserInfo implements Serializable {
    private int age ;
    private String desc;
}
