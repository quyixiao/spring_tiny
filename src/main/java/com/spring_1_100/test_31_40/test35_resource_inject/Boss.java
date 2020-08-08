package com.spring_1_100.test_31_40.test35_resource_inject;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Boss {

    private Car car ;


    @Resource(name = "car")
    private void setCar(Car car){
        System.out.println("execute in setCar");
        this.car = car;
    }



}
