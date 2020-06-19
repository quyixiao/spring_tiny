package com.test46;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test46 {

    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("classpath*:spring46.xml");
        MyPerson animal = bf.getBean(MyPerson.class);

        Student student = bf.getBean(Student.class);
        System.out.println(student);
        System.out.println(animal.getPerson());
    }
}
