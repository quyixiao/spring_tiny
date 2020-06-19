package com.test50;

public class StuFactory {

    //动态创建类
    public Stu getDynamicStu(String stuId) {


        return new Stu(stuId);



    }

}