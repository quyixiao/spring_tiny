package com.spring_101_200.test_111_120.test_117_excution.excution22;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AspectJTest {


    @Pointcut("execution(* com.spring_101_200.test_111_120.test_117_excution.excution22.*.*(..)) && args(userName,..)")
    public void test(String userName) {
        System.out.println("beforeTest");
    }



    @Before("test(userName)")
    public void before(String userName) {
        System.out.println("abeforeTest : " + userName);
    }


}
