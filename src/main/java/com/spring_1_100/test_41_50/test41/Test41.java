package com.spring_1_100.test_41_50.test41;

import com.alibaba.fastjson.JSON;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test41 {


    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_41_50/spring41.xml");

        System.out.println(JSON.toJSONString(bf.getBean("user")));
    }
}
