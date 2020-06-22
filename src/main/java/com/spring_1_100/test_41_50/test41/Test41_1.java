package com.spring_1_100.test_41_50.test41;

import org.springframework.core.DefaultParameterNameDiscoverer;
import org.springframework.util.ClassUtils;

public class Test41_1 {

    public static void main(String[] args) {
        boolean a = ClassUtils.isPresent(
                "java.lang.reflect.Executable", DefaultParameterNameDiscoverer.class.getClassLoader());
        System.out.println( a );
    }
}
