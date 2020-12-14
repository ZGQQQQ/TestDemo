package com.Demo.ProducerAndConsumer.edition01;

public class Demo01 {
	public static void main(String[] args) {
		//创建资源
		Resource resource = new Resource();
		//创建2个线程任务
		Producer producer = new Producer(resource);
		Consumer consumer = new Consumer(resource);
		//创建线程，在创建线程的同时明确线程的任务
		Thread t0 = new Thread(producer);
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);
		Thread t3 = new Thread(consumer);
		t0.start();
		t1.start();
		t2.start();
		t3.start();
	}
}
