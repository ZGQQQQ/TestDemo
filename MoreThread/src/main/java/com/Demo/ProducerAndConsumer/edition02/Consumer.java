package com.Demo.ProducerAndConsumer.edition02;



/**
* 消费者
*/
public class Consumer implements Runnable{
	private Resource resource;
	Consumer(Resource resource){
		this.resource =resource;
	}
	@Override
	public void run() {
		while (true){
			resource.get();
		}
	}
}
