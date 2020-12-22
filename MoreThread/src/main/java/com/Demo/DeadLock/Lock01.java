package com.Demo.DeadLock;

class Lock01 implements Runnable{
    public void run() {
        System.out.println(Thread.currentThread().getName()+"运行。。。。" );
        while (true){
            synchronized (DeadLockDemo.lock01){
                System.out.println(Thread.currentThread().getName()+"已经获取到lock01锁");
                try {Thread.sleep(10);} catch (InterruptedException e) { e.printStackTrace();}
                synchronized (DeadLockDemo.lock02){
                    System.out.println(Thread.currentThread().getName()+"获取到lock02锁");
                }
            }
        }
    }
}

class Lock02 implements Runnable{
    public void run() {
        System.out.println(Thread.currentThread().getName()+"运行。。。。" );
        while (true){
            synchronized (DeadLockDemo.lock02){
                System.out.println(Thread.currentThread().getName()+"已经获取到lock02锁");
                try {Thread.sleep(10);} catch (InterruptedException e) { e.printStackTrace();}
                synchronized (DeadLockDemo.lock01){
                    System.out.println(Thread.currentThread().getName()+"获取到lock01锁");
                }
            }
        }
    }
}
