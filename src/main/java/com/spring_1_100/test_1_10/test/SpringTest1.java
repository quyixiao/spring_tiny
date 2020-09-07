package com.spring_1_100.test_1_10.test;

import com.spring_1_100.test_1_10.test.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest1 {


    /**
     * Spring容器最基本的接口就是BeanFactory. BeanFactory负责配置、创建、管理Bean，它有一个子接口ApplicationContext,也称为Spring上下文。Spring容器负责管理Bean与Bean之间的信赖关系。
     *     BeanFactory有很多实现类，通常使用org.springframework.beans.factory.xml.XmlBeanFactory类。但对于大部分J2EE应用而言，推荐使用ApplicationContext.
     *     ApplicationContext是BeanFactory的子接口，其常用实现类是
     *     org.springframework.context.support.FileSystemXmlApplicationContext
     *     org.springframework.context.support.ClassXmlAplicationContext。
     * Springr的配置信息通常采用XML配置文件来设置，因此，创建BeanFactory实例时，应该提供XML配置文件作为参数。、
     * 下面详细介绍ApplicationContext的实际运用：
     * 一：ClassPathXmlApplicationContext
     *
     * 4.可以同时加载多个文件
     *   String[] xmlCfg = new String[] { "classpath:base.spring_test1.xml","app.spring_test1.xml"};
     *   ApplicationContext appCt = new ClassPathXmlApplicationContext(xmlCfg);
     *
     */
    /**
     * 1.没有前缀：默认为项目的classpath下相对路径
     *    ApplicationContext appCt = new ClassPathXmlApplicationContext("app.spring_test1.xml");
     * 对于这种情况，我们不做源码解读
     */
    @Test
    public void test() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_1_100/config_1_10/spring.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        userService.query();
    }

    /**
     * 2.前缀classpath：表示的是项目的classpath下相对路径
     *    ApplicationContext appCt = new ClassPathXmlApplicationContext("classpath:app.spring_test1.xml");
     */
    @Test
    public void test1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_1_10/spring.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        userService.query();
    }

    /**
     * 3.使用前缀file 表示的是文件的绝对路径
     *    ApplicationContext appCt = new ClassPathXmlApplicationContext("file:D:/app.spring_test1.xml");
     */
    @Test
    public void test3() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("file:${user.dir}/src/main/resources/spring_1_100/config_1_10/spring_test1.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        userService.query();
    }

    /**4.使用通配符加载所有符合要求的文件
     *   ApplicationContext appCt = new ClassPathXmlApplicationContext("*.spring_test1.xml");
     */
    @Test
    public void test4() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_1_100/config_1_10/spring_test1/*.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        userService.query();
    }


    /*
     *
     * 二：FileSystemXmlApplicationContext
     * 1.默认为项目工作路径 即项目的根目录
     * ApplicationContext appCt2 = new FileSystemXmlApplicationContext("src/main/resources/app.spring_test1.xml");
     *
     * 2.前缀classpath：表示的是项目的classpath下相对路径
     *    ApplicationContext appCt2 = new FileSystemXmlApplicationContext("classpath:app.spring_test1.xml");
     *
     * 3.使用前缀file 表示的是文件的绝对路径
     *    ApplicationContext appCt2 = new FileSystemXmlApplicationContext("file:D:/app.spring_test1.xml");
     *    ApplicationContext appCt2 = new FileSystemXmlApplicationContext("D:/app.spring_test1.xml");
     *
     * 4.可以同时加载多个文件
     *   String[] xmlCfg = new String[] { "src/main/resources/base.spring_test1.xml","classpath:app.spring_test1.xml"};
     *   ApplicationContext appCt2 = new FileSystemXmlApplicationContext(xmlCfg);
     *
     * 5.使用通配符加载所有符合要求的文件
     *   ApplicationContext appCt2 = new FileSystemXmlApplicationContext("classpath:*.spring_test1.xml");
     */

}
