package com.spring_101_200.test_191_200.test_200_t.thread.t20220106.t1337;

public class ThreadA  extends Thread{
    private Object lock;

    public ThreadA(Object lock) {
        this.lock = lock;
    }


    @Override
    public void run() {
        try {
            synchronized (lock){
                if(MyList.size() != 5 ){
                    System.out.println("wait begin " + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("wait end " + System.currentTimeMillis());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
