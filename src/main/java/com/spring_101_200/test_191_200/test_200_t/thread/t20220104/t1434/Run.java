package com.spring_101_200.test_191_200.test_200_t.thread.t20220104.t1434;

public class Run {

    public static void main(String[] args) {
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        thread1.start();


        MyThread2 thread2 = new MyThread2(task);
        thread2.start();

    }
}
