package com.spring_1_100.test_41_50.test50;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static com.sun.jmx.mbeanserver.Util.cast;

public class SpringFactoryMethod {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_41_50/spring50.xml");


        //获取动态Bean
        Stu dynamicStu = cast(ac.getBean("dynamicStu"));

        System.out.println(dynamicStu);

    }

}