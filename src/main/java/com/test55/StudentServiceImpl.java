package com.test55;

public class StudentServiceImpl implements StudentService {
    @Override
    public void helloSpring(String str) {
        System.out.println("hello Spring");
    }


    public void destory() {
        System.out.println("destry ---------");
    }
}
