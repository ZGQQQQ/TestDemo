package com.Demo.ProducerAndConsumer.edition02;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 资源类
 */
public class Resource {
	private String name;
	private int count = 1;
	private boolean flag = true;

	Lock lock = new ReentrantLock();//创建锁
	Condition producer_con = lock.newCondition();
	Condition consumer_con = lock.newCondition();

	//给生产者使用的方法
	public void set(String name) {
		lock.lock();
		try {
			while (flag)
				try {
					producer_con.await();} catch (InterruptedException e) {}
			this.name = name + count;
			count++;
			System.out.println(Thread.currentThread().getName() + "生成了第" + count + "只烤鸭" + "。。。");
			flag = true;
			consumer_con.signal();
		} finally {
			lock.unlock();
		}
	}


	//给消费者使用的方法
	public void get() {
		lock.lock();
		try {
			while (!flag)
				try {
					consumer_con.await();} catch (InterruptedException e) {}
			System.out.println(Thread.currentThread().getName() + "消费了第" + count + "只烤鸭");
			flag = false;
			producer_con.signal();
		} finally {
			lock.unlock();
		}
	}
}
