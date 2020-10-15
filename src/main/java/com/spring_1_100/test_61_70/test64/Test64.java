package com.spring_1_100.test_61_70.test64;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test64 {


    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_61_70/spring64.xml");
        TestBean testBean = ac.getBean(TestBean.class);
        testBean.test();
    }
}
