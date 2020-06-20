package com.test53;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test53 {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring53.xml");

        TestBeanFactory beanFactory = ac.getBean(TestBeanFactory.class);
        beanFactory.testAware();


    }
}
