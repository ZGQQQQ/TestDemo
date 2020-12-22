package com.testCallable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class MyThread implements Callable<Integer>{
	@Override
	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName() + "进来了。");
		return 1024;
	}
}

public class CallableDemo {
	public static void main(String[] args) throws Exception {
		FutureTask<Integer> futureTask = new FutureTask<>(new MyThread());
		new Thread(futureTask,"t1线程").start();
		new Thread(futureTask,"t2线程").start();
		System.out.println(futureTask.get());
		System.out.println(Thread.currentThread().getName() + "运行结束");
	}
}
