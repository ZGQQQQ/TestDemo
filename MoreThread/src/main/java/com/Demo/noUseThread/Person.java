package com.Demo.noUseThread;

public class Person {
	private String name;

	Person(String name) {
		this.name = name;
	}

	public void show() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + "---" + Thread.currentThread().getName() + "---" + i);
		}
	}
}
