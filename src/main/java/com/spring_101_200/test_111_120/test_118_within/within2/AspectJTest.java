package com.spring_101_200.test_111_120.test_118_within.within2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AspectJTest {


    @Before("within(com..within2..UserService+)")
    public void beforeTest() {
        System.out.println("beforeTest");
    }

}
