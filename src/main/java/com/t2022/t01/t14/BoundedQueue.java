package com.t2022.t01.t14;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BoundedQueue<T> {

    private Object [] items;

    //添加的下标，删除的下标和数组当前数量
    private int addIndex ,removeIndex,count ;
    private Lock lock = new ReentrantLock( );
    private Condition  notEmpty = lock.newCondition() ;
    private Condition full = lock.newCondition();

    public BoundedQueue(int size){
        items = new Object[size];
    }

    // 添加一个元素，如果数组满，则添加线程进入等待状态，直到 空位
    public void add(T t ) throws  InterruptedException {
        lock.lock();
        try{
            while (count == items.length ){
                full.await();
            }
            items[addIndex] = t;
            if(++addIndex == items.length){
                addIndex = 0 ;
            }
            ++count ;
            notEmpty.signal();
        }finally {
            lock.unlock();
        }
    }

    // 由头部删除一个元素 ， 如果数组为空，则删除的线程进入等待状态，直到新添加的元素
    public T remove() throws InterruptedException {
        lock.lock();
        try {
            while (count == 0) {
                notEmpty.await();
            }
            Object x = items[removeIndex];


            if (++removeIndex == items.length) {
                removeIndex = 0;
            }
            --count;
            full.signal();
            return (T) x;
        } finally {
            lock.unlock();
        }
    }




}
