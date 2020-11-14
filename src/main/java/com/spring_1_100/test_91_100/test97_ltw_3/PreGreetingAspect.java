package com.spring_1_100.test_91_100.test97_ltw_3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class PreGreetingAspect {


    @Before("execution(* com.spring_1_100.test_91_100.test97_ltw.*.*(..))  && args(..)")
    public void beforeTest() {
        System.out.println("beforeTest");
    }



    @After("execution(* com.spring_1_100.test_91_100.test97_ltw.*.*(..))")
    public void after() {
        System.out.println("after");
    }





    @AfterThrowing(value = "execution(* com.spring_1_100.test_91_100.test97_ltw.*.*(..))",throwing = "e")
    public void afterThrowing(Exception e ) {
        System.out.println("afterThrowing");
    }


    @AfterReturning(value = "execution(* com.spring_1_100.test_91_100.test97_ltw.*.*(..))",returning = "b")
    public void afterReturning(String     b ) {
        System.out.println("afterReturning b :" + b );
    }



    @Around("execution(* com.spring_1_100.test_91_100.test97_ltw.*.*(..))")
    public Object aroundTest(ProceedingJoinPoint p) {
        System.out.println("around before1");
        Object o = null;
        try {
            o = p.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("around after1");
        return o;
    }



}
