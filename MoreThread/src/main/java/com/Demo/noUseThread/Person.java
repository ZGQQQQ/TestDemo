package com.Demo.noUseThread;

public class Person {
	private String name;

	Person(String name) {
		this.name = name;
	}
//666666666666666666666666666666
	public void show() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + "---" + Thread.currentThread().getName() + "---" + i);
		}
	}
}
