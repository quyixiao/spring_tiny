package com.spring_101_200.test_111_120.test_117.excution19;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.PARAMETER,ElementType.FIELD})
@Documented
public @interface MyAnnotation {
    String value() default "";

}