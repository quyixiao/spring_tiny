package com.test58;

import com.test57.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test58 {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring58.xml");

        HelloMessage us = ac.getBean(HelloMessage.class);
        System.out.println(us.getMsg());
    }
}
