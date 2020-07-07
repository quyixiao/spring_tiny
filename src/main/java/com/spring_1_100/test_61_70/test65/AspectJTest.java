package com.spring_1_100.test_61_70.test65;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AspectJTest {

    @Pointcut("execution(* com.spring_1_100.test_61_70.test65.*.*(..)) && args(..)")
    public void test() {

    }


    @Before("test()")
    public void abeforeTest(JoinPoint jp) {
        System.out.println("abeforeTest" + JSON.toJSONString(jp.getArgs()));
    }


    @Before("test()")
    public void beforeTest() {
        System.out.println("beforeTest");
    }


    @After("test()")
    public void afterTest() {
        System.out.println("afterTest()");
    }


    @After("test()")
    public void bafterTest() {
        System.out.println("bafterTest()");
    }


    @AfterReturning("test()")
    public void AfterReturning() {
        System.out.println("AfterReturning()");
    }




    @Around("test()")
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
