package com.test49;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test49 {


    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("classpath:spring49.xml");
        Student student = bf.getBean(Student.class);
        Teacher teacher = bf.getBean(Teacher.class);
        System.out.println(student);
        System.out.println(teacher.getUserName());

    }


}
