package com.spring_1_100.test_41_50.test50;

import com.alibaba.fastjson.JSON;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test50 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_41_50/spring50.xml");
        //获取动态Bean
        Stu stu =(Stu) ac.getBean("dynamicStu");
        System.out.println(JSON.toJSONString(stu));

    }

}