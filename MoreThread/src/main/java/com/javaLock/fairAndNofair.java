package com.javaLock;

import java.util.concurrent.locks.ReentrantLock;

public class fairAndNofair {

	public synchronized void test01() {
		test02();
	}

	public synchronized void test02() {

	}
}
