package com.test48;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test48 {

    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("classpath:spring48.xml");


        MyPerson myPerson = bf.getBean(MyPerson.class);
        System.out.println(myPerson.getPerson());

    }
}
