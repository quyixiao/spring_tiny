package com.test37;

import lombok.Data;

@Data
public class Person {

    private String name ;

    private Integer age ;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
