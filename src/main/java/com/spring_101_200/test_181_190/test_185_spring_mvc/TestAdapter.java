package com.spring_101_200.test_181_190.test_185_spring_mvc;

import org.springframework.core.annotation.AnnotationAwareOrderComparator;

import java.util.ArrayList;
import java.util.List;

public class TestAdapter {

    public static void main(String[] args) {

        HandlerAdapter1 handlerAdapter1 = new HandlerAdapter1();
        HandlerAdapter2 handlerAdapter2 = new HandlerAdapter2();
        List<IAdapter> adapterList = new ArrayList<>();

        adapterList.add(handlerAdapter1);
        adapterList.add(handlerAdapter2);


        AnnotationAwareOrderComparator.sort(adapterList);
        for(IAdapter handlerAdapter:adapterList){
            System.out.println(handlerAdapter.getClass().getSimpleName());
        }
    }
}
