package com.Demo.useRannable;

public class Person implements Runnable {
	private String name;
	Person(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "---" + Thread.currentThread().getName() + "---" + i);
		}
	}
}



