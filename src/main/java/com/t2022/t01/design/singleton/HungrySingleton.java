package com.t2022.t01.design.singleton;

public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();


    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return instance;
    }

}
