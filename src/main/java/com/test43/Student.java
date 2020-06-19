package com.test43;


import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("service")
public class Student extends User {
    public void showMe() {
        System.out.println("i am student ");
    }
}