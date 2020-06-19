package com.test41;

import org.springframework.core.DefaultParameterNameDiscoverer;
import org.springframework.util.ClassUtils;

public class Test41_1 {

    public static void main(String[] args) {
        boolean a = ClassUtils.isPresent(
                "java.lang.reflect.Executable", DefaultParameterNameDiscoverer.class.getClassLoader());
        System.out.println( a );
    }
}
