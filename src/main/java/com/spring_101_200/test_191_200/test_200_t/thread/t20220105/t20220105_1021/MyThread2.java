package com.spring_101_200.test_191_200.test_200_t.thread.t20220105.t20220105_1021;

import java.util.Random;

public class MyThread2 extends Thread {

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        long addResult = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 500000; i++) {
                Random random = new Random();
                random.nextInt();
                addResult = addResult + i;
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("* * * * * * thread2 2 user time = " + (endTime - beginTime));


    }
}
