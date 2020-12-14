package com.Demo.useRannable;

public class RunnableDemo {
	public static void main(String[] args) {
		//Person不是线程对象，因为没有继承Thread；
		//但是，由于Person实现了Runnable接口，又覆盖了Runnable接口的run()方法，
		//线程任务就封装在Runnable接口的实现类Person对象的run()方法中，
		Person p1 = new Person("张三");

		/*
		Thread thread = new Thread();
		//通过这种方法调用start方法，执行的是Thread的run方法
		thread.start();
		*/

		//thread1、thread2才是真正的线程对象
		Thread thread1 = new Thread(p1);
		Thread thread2 = new Thread(p1);
		//通过这种方法调用start方法，执行的是Runnable接口实现类Person对象的run()方法
		thread1.start();
		thread2.start();
	}
}
