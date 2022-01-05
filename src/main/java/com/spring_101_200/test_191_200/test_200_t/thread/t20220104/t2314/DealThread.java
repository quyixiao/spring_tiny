package com.spring_101_200.test_191_200.test_200_t.thread.t20220104.t2314;

public class DealThread implements Runnable {
    public String username;
    public Object lock1 = new Object();
    public Object lock2 = new Object();

    public void setFlag(String username) {
        this.username = username;
    }


    @Override
    public void run() {
        System.out.println("===========================");
        if (username.equals("a")) {
            synchronized (lock1) {
                try {
                    System.out.println("username=" + username);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (lock2) {
                System.out.println("接lock1 -> lock2 代码顺序执行了");
            }
        }

        if (username.equals("b")) {
            synchronized (lock2) {
                try {
                    System.out.println("username  = " + username);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


            synchronized (lock1) {
                System.out.println("接lock2 ->lock1 代码顺序执行了");
            }
        }
    }

}
