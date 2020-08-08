package com.spring_1_100.test_1_10.test;

import com.spring_1_100.test_1_10.test.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest1 {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext
                = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_1_10/spring.xml");
        UserService userService = classPathXmlApplicationContext.getBean(UserService.class);

        userService.query();

    }
}
