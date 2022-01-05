package com.spring_101_200.test_191_200.test_200_t.thread.t20220104.t1453;

public class MyThread1 extends Thread {

    private Task task;

    public MyThread1(Task task) {
        super();
        this.task = task;
    }


    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
