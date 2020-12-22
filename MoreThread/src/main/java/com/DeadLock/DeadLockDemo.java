package com.DeadLock;

public class DeadLockDemo {
    public static String lock01 = "lock01";
    public static String lock02 = "lock02";

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Lock01(),"t1线程");
        Thread thread2 = new Thread(new Lock02(),"t2线程");
        thread1.start();
        thread2.start();

    }


}
