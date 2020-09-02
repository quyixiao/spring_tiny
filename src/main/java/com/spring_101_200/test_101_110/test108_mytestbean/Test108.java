package com.spring_101_200.test_101_110.test108_mytestbean;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test108 {

    @Test
    public void test() {
        XmlBeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring_101_200/config_101_110/spring108_mytestbean.xml"));
        MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
        BeanDefinition beanDefinition = bf.getBeanDefinition("myTestBean");
        Object a = beanDefinition.getAttribute("testStr");
        System.out.println(a );
        System.out.println(bean.getTestStr());
    }
}
