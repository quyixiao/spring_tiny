package com.test2;


import com.LogUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Pointcut;

public class Aspectj22 {


    //@Pointcut("execution(public * com.test2..*.*(..))")
    public void webLog() {

    }


    public Object doAround(ProceedingJoinPoint pjp) {
        Object result = null;
        try {
            LogUtils.info("111111111111111111111111111111111");
            result = pjp.proceed();
            LogUtils.info("22222222222222222222222222222222");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return result;
    }


}
