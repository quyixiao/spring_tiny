package com.test39;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test39 {
    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("classpath:spring39.xml");


        UserManager userManager = (UserManager) bf.getBean("userManager");
        System.out.println(userManager);


    }
}



