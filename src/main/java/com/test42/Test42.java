package com.test42;

import com.alibaba.fastjson.JSON;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test42 {

    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("classpath:spring42.xml");
        TestChangeMethod testChangeMethod =(TestChangeMethod) bf.getBean("testChangeMethod");
        testChangeMethod.changeMe();
    }
}



