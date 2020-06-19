package com.test50;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.java2d.pipe.SpanIterator;

import static com.sun.jmx.mbeanserver.Util.cast;

public class SpringFactoryMethod {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring50.xml");


        //获取动态Bean
        Stu dynamicStu = cast(ac.getBean("dynamicStu"));

        System.out.println(dynamicStu);

    }

}