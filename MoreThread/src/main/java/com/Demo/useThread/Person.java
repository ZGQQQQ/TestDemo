package com.Demo.useThread;

public class Person extends Thread{
	private String name;
	Person(String name) {
		super();
		this.name = name;
	}
	public void run() {
		for (int i = 0; i < 2; i++) {
			//Thread.currentThread().getName()  调用的是执行此行代码的线程的getName方法
			System.out.println(name + "---" + Thread.currentThread().getName() + "---" + i);
			//getName()  调用的是Person对象父类Thread的getName方法
			System.out.println(name + "---" + getName() + "---" + i);
		}
	}
}
