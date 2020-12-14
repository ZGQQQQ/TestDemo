package com.Demo.useThread;

public class ThreadDemo {
	public static void main(String[] args) {
		//当创建Thread的子类对象时就已经完成了线程名称的定义
		Person p1 = new Person("张三");
		Person p2 = new Person("李四四四四");
		//调用run方法不会开启线程，只有主线程在执行
		p1.run();
		p2.run();
//		System.out.println("---------------------------");
//		//start方法作用：1-开启线程；2-调用run方法
//		p1.start();
//		p2.start();
	}
}
