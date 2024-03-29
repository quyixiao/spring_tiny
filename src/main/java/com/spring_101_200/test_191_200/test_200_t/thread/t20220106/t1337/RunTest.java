package com.spring_101_200.test_191_200.test_200_t.thread.t20220106.t1337;

public class RunTest {




    // 日志信息wait end 在最后输出，也就说明了notify()方法执行后并不立即释放锁，这个知识点在后面进行补充介绍
    // 关键字synchronized可以将任何一个Object对象作为同步对象来看待，而Java为每个Object临界区内，通过调用wait()方法可以使用处理临界区
    // 的线程进入等待状态，同时释放被同步对象的锁，而notify操作可以唤醒一个因为调用wait操作而处于阻塞状态中的线程，命名其进入就绪状态 。
    // 被重新唤醒的线程会试图重新获得重新获得临界区的控制权，也就是锁，并继续执行临界区内的wait之后的代码，如果没有发出notify操作时没有
    // 处于阻塞状态中的线程，那么该命令被忽略
    // wait()方法可以使用调用该方法的线程释放共享资源的锁，然后从运行状态退出，进入等待队列，直到被再次唤醒
    // notify()方法可以随机的唤醒等待队列中等待同一共享资源的一个线程，并使该线程退出等待队列，进入可运行状态，也就是notify()方法通知一个线程。
    // notifyAll() 方法可以使所有正在等待队列中等待同一共享资源的全部线程从等待状态退出，进入可运行状态，此时，优先级最高的那个线程最先执行。
    // 但是也可能是随机执行，因为这要取决于JVM虚拟机的实现。
    // 1)新创建一个线程对象后，再调用它的start()方法，系统会为此线程分配CPU资源，使其处于Runnable(可运行)状态，这是一个准备运行的阶段，
    //  如果线程抢占到了CPU资源，此线程就处于Running(运行状态)
    // 2)Runnable状态和Running状态可相互切换，因为有可能线程运行一段时间后，有其他高优先级的线程抢占了CPU资源，这时此线程就从Running状态变成了Runnable状态
    // 线程进入Runnable状态大体分为如下5种情况 ：
    // 调用sleep()方法后经过的时候超过指定的休眠时间
    // 线程调用的阻塞IO已经返回，阻塞方法执行完毕
    // 线程成功地获得了试图同步的监视器
    // 线程正在等待某个通知，其他线程发出了通知
    // 处于挂起状态的线程调用了resume恢复了方法
    // 3) Blocked是阻塞的意思，例如遇到一个IO操作，此时CPU处于空闲状态，可能会转而把CPU的时间片分配给其他线程，这里可也可称为暂停状态
    // Blocked状态结束后，进入Runnable状态，等待系统重新分配资源
    // 出现阻塞的情况大体分为如下5种
    // 1)线程调用sleep方法，主动放弃占用的处理器资源
    // 2)线程调用了阻塞式IO方法，在该方法返回前，该线程被阻塞
    // 3)线程试图获得一个同步监视器，但该同步监视器正在被其他线程持有
    // 4)线程等待某个通知
    // 5)程序调用了suspend()方法将该线程挂起，此方法容易导致死锁，尽量避免使用该方法。

    // run()方法运行结束后进入销毁阶段，整个线程执行完毕
    // 每个锁对象都有两个队列，一个是就绪队列，一个是阻塞队列，就绪队列存储了将要获得锁的线程，阻塞队列存储了被阻塞的线程，一个线程被唤醒后
    // 才会进入就绪队列，等待CPU的调度，反之，一个线程被wait后，就会进入阻塞队列，等待下一次被唤醒 。
    //
    public static void main(String[] args)  throws Exception{
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        Thread.sleep(50);
        ThreadB b = new ThreadB(lock);
        b.start();
    }
}
