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
    //========[requires_new[requires_new-exception]]=====result:[rollback[rollback]]========================
    @Test
    public void updateUserRequiresNewTest1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_71_80/spring74.xml");
        TxService txService = (TxService) ac.getBean("txService");
        txService.updateUserRequiresNewTest1();
    }
    //========[requires_new-exception[requires_new]]=====result:[rollback[commit]]========================
    @Test
    public void updateUserRequiresNewTest2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_71_80/spring74.xml");
        TxService txService = (TxService) ac.getBean("txService");
        txService.updateUserRequiresNewTest2();
    }

    //========[required-exception[requires_new]]=====result:[rollback[commit]]========================
    @Test
    public void updateUserRequiresNewTest22() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_71_80/spring74.xml");
        TxService txService = (TxService) ac.getBean("txService");
        txService.updateUserRequiresNewTest22();
    }

    //========[required[requires_new][requires_new-exception]]=====result:[rollback[commit][rollback]]========================
    @Test
    public void updateUserRequiresNewTest222() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_71_80/spring74.xml");
        TxService txService = (TxService) ac.getBean("txService");
        txService.updateUserRequiresNewTest222();
    }
    //========[required[required-exception]]=====result:[rollback[rollback]]=========================================
    @Test
    public void updateUserRequiresTest1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_71_80/spring74.xml");
        TxService txService = (TxService) ac.getBean("txService");
        txService.updateUserRequiresTest1();
    }

    //========[required-exception[required]]=====result:[rollback[rollback]]=========================================
    @Test
    public void updateUserRequiresTest2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_71_80/spring74.xml");
        TxService txService = (TxService) ac.getBean("txService");
        txService.updateUserRequiresTest2();
    }
    //========[requires_new-exception[required]]=====result:[rollback[rollback]]=========================================
    @Test
    public void updateUserRequiresNewTest3() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_71_80/spring74.xml");
        TxService txService = (TxService) ac.getBean("txService");
        txService.updateUserRequiresNewTest3();
    }

    //========[required[requires_new-exception]]=====result:[rollback[rollback]]=========================================
    @Test
    public void updateUserRequiresNewTest4() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_71_80/spring74.xml");
        TxService txService = (TxService) ac.getBean("txService");
        txService.updateUserRequiresNewTest4();
    }


    //========[required-exception[supports]]=====result:[rollback[rollback]]=========================================
    @Test
    public void updateUserRequiresNewTest5() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_71_80/spring74.xml");
        TxService txService = (TxService) ac.getBean("txService");
        txService.updateUserRequiresNewTest5();
    }
    //========[none-exception[supports]]=====result:[commit[commit]]=========================================
    @Test
    public void updateUserRequiresNewTest6() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_71_80/spring74.xml");
        TxService txService = (TxService) ac.getBean("txService");
        txService.updateUserRequiresNewTest6();
    }

    //========[none[supports-exception]]=====result:[commit[commit]]=========================================
    @Test
    public void updateUserRequiresNewTest7() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_71_80/spring74.xml");
        TxService txService = (TxService) ac.getBean("txService");
        txService.updateUserRequiresNewTest7();
    }

    //========[required[supports-exception]]=====result:[rollback[rollback]]=========================================
    @Test
    public void updateUserRequiresNewTest8() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_71_80/spring74.xml");
        TxService txService = (TxService) ac.getBean("txService");
        txService.updateUserRequiresNewTest8();
    }
    //========[requires_new[supports-exception]]=====result:[rollback[rollback]]=========================================
    @Test
    public void updateUserRequiresNewTest9() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_71_80/spring74.xml");
        TxService txService = (TxService) ac.getBean("txService");
        txService.updateUserRequiresNewTest9();
    }


    //========[requires_new[mandatory]]=====result:[rollback[rollback]]=========================================
    @Test
    public void updateUserRequiresNewTest11() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_71_80/spring74.xml");
        TxService txService = (TxService) ac.getBean("txService");
        txService.updateUserRequiresNewTest11();
    }

    //========[none[mandatory]]=====result:[commit[exception]]=========================================
    @Test
    public void updateUserRequiresNewTest12() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_71_80/spring74.xml");
        TxService txService = (TxService) ac.getBean("txService");
        txService.updateUserRequiresNewTest12();
    }


    //========[required][mandatory]=====result:[commit][exception]=========================================
    @Test
    public void updateUserRequiresNewTest13() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_71_80/spring74.xml");
        TxService txService = (TxService) ac.getBean("txService");
        txService.updateUserRequiresNewTest13();
    }

    //不同数据========[required[not_supported-exception]]=====result:[rollback[commit]]=========================================
    @Test
    public void updateUserRequiresNewTest14() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_71_80/spring74.xml");
        TxService txService = (TxService) ac.getBean("txService");
        txService.updateUserRequiresNewTest14();
    }


    //同一条数据========[required[not_supported-exception]]=====result:[程序被挂起，但是内部的not_supported修改的内容被提交]=========================================
    @Test
    public void updateUserRequiresNewTest144() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_71_80/spring74.xml");
        TxService txService = (TxService) ac.getBean("txService");
        txService.updateUserRequiresNewTest144();
    }


    //========[none[not_supported-exception]]=====result:[commit[commit]]=========================================
    @Test
    public void updateUserRequiresNewTest15() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_71_80/spring74.xml");
        TxService txService = (TxService) ac.getBean("txService");
        txService.updateUserRequiresNewTest15();
    }









































}
