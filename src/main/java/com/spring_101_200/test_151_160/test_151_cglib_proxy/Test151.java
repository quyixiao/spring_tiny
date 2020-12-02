package com.spring_101_200.test_151_160.test_151_cglib_proxy;

public class Test151 {

    public static void main(String[] args) {
        HelloServiceCglib cglibProxy = new HelloServiceCglib();
        HelloService helloService = (HelloService) cglibProxy.getInstance(new HelloServiceImpl());
        helloService.sayHello("张三");
    }
}
