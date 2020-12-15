/*
package com.Demo.ProducerAndConsumer.edition01;

*/
/**
 * 资源类
 *//*

public class Resource {
	private String name;
	private int count = 1;
	private boolean flag = true;

	//给生产者使用的方法
	public synchronized void set(String name) {
//		if (flag)
		while (flag)
			try {wait();} catch (InterruptedException e) {e.printStackTrace();}
		this.name = name + count;
		count++;
		System.out.println(Thread.currentThread().getName() + "生成了第" + count + "只烤鸭" +"。。。");
		flag = true;
//		notify();
		notifyAll();
	}

	//给消费者使用的方法
	public synchronized void get() {
//		if (!flag)
		while (!flag)
			try {wait();} catch (InterruptedException e) {e.printStackTrace();}
		System.out.println(Thread.currentThread().getName() + "消费了第" + count + "只烤鸭");
		flag = false;
//		notify();
		notifyAll();
	}
}
*/
