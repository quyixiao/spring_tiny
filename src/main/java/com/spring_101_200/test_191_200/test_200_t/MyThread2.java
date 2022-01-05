package com.spring_101_200.test_191_200.test_200_t;

public class MyThread2 extends Thread {


    private int count = 5;

    @Override
    public synchronized void run() {
        super.run();
        count--;
        System.out.println("由 " + this.currentThread().getName() + " 计算结果count = " + count);
    }


    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        Thread a = new Thread(myThread2, "A");
        Thread b = new Thread(myThread2, "B");
        Thread c = new Thread(myThread2, "C");
        Thread d = new Thread(myThread2, "D");
        a.start();
        b.start();
        c.start();
        d.start();
    }
}
