package com.spring_1_100.test_31_40.test35_resource_inject.anno;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Service;

import java.lang.annotation.*;


@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Service
public @interface  MyRequestAnnotation {

    String value() default "";
}
