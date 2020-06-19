package com.test;

import com.test3.InstrumentTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringTest14 {


    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext classPathXmlApplicationContext
                = new ClassPathXmlApplicationContext("classpath:spring14.xml");



        InstrumentTest instrumentTest = (InstrumentTest) classPathXmlApplicationContext.getBean("instrumentTest");
        System.out.println(instrumentTest.getInstrument());




    }
}
