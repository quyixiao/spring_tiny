package com.test57;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test57 {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring57.xml");

        User user = ac.getBean(User.class);
        System.out.println(user.getAge());

    }
}
