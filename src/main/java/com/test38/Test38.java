package com.test38;

import com.test37.TestA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test38 {
    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("classpath:spring38.xml");


        UserManager userManager = (UserManager) bf.getBean("userManager");
        System.out.println(userManager);


    }
}



