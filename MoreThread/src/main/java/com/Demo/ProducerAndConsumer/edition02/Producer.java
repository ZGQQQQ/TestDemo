package com.Demo.ProducerAndConsumer.edition02;



/**
 * 生产者
 */
public class Producer implements Runnable{
	private Resource resource;
	Producer(Resource resource){
		this.resource = resource;
	}
	@Override
	public void run() {
		while (true){
			resource.set("烤鸭");
		}
	}
}
