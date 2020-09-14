package com.spring_101_200.test_111_120.test_113_conversion;


import com.thoughtworks.xstream.core.util.Fields;
import org.junit.Test;
import org.springframework.core.MethodParameter;
import org.springframework.core.ResolvableType;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Test113_1 {

    static class ExtendsList extends ArrayList<CharSequence> {
    }

    @Test
    public void forClass() throws Exception {
        ResolvableType type = ResolvableType.forClass(ExtendsList.class);
        System.out.println(type.getType());

    }


    @Test
    public void forMethodParameter() throws Exception {
        Method method = Method.class.getMethod("charSequenceParameter", List.class);
        MethodParameter methodParameter = MethodParameter.forMethodOrConstructor(method, 0);
        ResolvableType type = ResolvableType.forMethodParameter(methodParameter);
        System.out.println(type.getType());
    }

    @Test
    public void forField() throws Exception {
        Field field = Fields.class.getField("charSequenceList");
        ResolvableType type = ResolvableType.forField(field);
        System.out.println(type.getType());
    }
}
