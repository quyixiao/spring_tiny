package com.spring_101_200.test_191_200.test_197_directFieldAccessor;


import java.lang.annotation.*;

@Target({ElementType.PARAMETER, ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public  @interface IWhere {
    String tableName () default "" ;
    String columns()[] default {} ;
    String values()[]  default {};
}
