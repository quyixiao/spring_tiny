package com.spring_101_200.test_191_200.test_197_directFieldAccessor;


import javax.validation.constraints.NotNull;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ITable {
    String tableName() default "";

    String column() default "";

    String []columns() default {};
    String []values() default {};
}
