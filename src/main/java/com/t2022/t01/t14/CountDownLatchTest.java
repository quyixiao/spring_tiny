package com.t2022.t01.t14;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

    static CountDownLatch c = new CountDownLatch(1);

    public static void main(String[] args) throws Exception {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
                c.countDown();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(2);
                c.countDown();
            }
        }).start();
        c.await();
        System.out.println("3");
    }

}
