package com.test45;

import com.test43.GetBeanTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test45 {

    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("classpath:spring45.xml");
        Animal animal = bf.getBean(Animal.class);
        System.out.println(animal.getPerson());

    }
}
