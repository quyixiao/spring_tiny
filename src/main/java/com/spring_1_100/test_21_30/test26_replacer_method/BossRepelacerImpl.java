package com.spring_1_100.test_21_30.test26_replacer_method;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class BossRepelacerImpl implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        Car car = new Car();
        car.setBrand("美人");
        return car;
    }
}
