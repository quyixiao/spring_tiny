package com.spring_101_200.test_111_120.test_117_excution.excution20;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AspectJTest extends AspectjParent {


    @Before("test()")                                                    //com 包及所有子包下UserService接口中的任何无参方法
    public void beforeTest() {
        System.out.println("beforeTest");
    }


}
