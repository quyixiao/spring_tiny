package com.spring_101_200.test_121_130.test_122_bean.bean1;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.PARAMETER,ElementType.FIELD})
@Documented
public @interface MyAnnotation {
    String value() default "";

}