package com.spring_1_100.test_31_40.test37;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test37 {
    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_31_40/spring37.xml");
        System.out.println(((TestA)bf.getBean("testA")).getTestB());
    }
}
