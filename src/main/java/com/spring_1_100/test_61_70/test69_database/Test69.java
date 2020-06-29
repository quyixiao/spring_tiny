package com.spring_1_100.test_61_70.test69_database;

import com.alibaba.fastjson.JSON;
import com.spring_1_100.test_61_70.test68_static_proxy.Aservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test69 {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_61_70/spring69.xml");

        UserService userService =(UserService) ac.getBean("userService");
        List<User> users = userService.getUsersByName("19884189046") ;
        System.out.println(JSON.toJSONString(users));

    }

}
