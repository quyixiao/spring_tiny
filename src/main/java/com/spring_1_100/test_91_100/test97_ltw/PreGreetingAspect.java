package com.spring_1_100.test_91_100.test97_ltw;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class PreGreetingAspect {
    @Before("execution(* greetTo(..))")
    public void beforeGreeting() {
        System.out.println("How are you");
    }


}
