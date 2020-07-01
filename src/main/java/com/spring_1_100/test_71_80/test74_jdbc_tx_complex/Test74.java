package com.spring_1_100.test_71_80.test74_jdbc_tx_complex;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test74 {


    @Test
    public void updateUser() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_71_80/spring74.xml");
        TxService txService = (TxService) ac.getBean("txService");
        txService.updateUser();
    }

    @Test
    public void updateUserRequiresNewTest1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_71_80/spring74.xml");
        TxService txService = (TxService) ac.getBean("txService");
        txService.updateUserRequiresNewTest1();
    }

    @Test
    public void updateUserRequiresNewTest2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_71_80/spring74.xml");
        TxService txService = (TxService) ac.getBean("txService");
        txService.updateUserRequiresNewTest2();
    }


}
