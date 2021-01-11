package com.spring_101_200.test_191_200.test_197_directFieldAccessor;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface IWheres {
    IWhere [] value() default {};
}
