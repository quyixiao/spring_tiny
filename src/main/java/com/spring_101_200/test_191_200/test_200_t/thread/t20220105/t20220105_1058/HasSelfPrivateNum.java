package com.spring_101_200.test_191_200.test_200_t.thread.t20220105.t20220105_1058;

public class HasSelfPrivateNum {

    public void addI(String username) {
        try {
            int num = 0;
            if (username.equals("a")) {
                num = 100;
                System.out.println("a set over !");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println(" b set over !");
            }
            System.out.println(username + " num = " + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




}
