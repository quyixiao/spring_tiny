package com.spring_101_200.test_111_120.test_117.excution2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AspectJTest {


    @Before("execution(public * *(..))")                                                          //任何公共方法的执行
    public void beforeTest() {
        System.out.println("beforeTest");
    }

}
