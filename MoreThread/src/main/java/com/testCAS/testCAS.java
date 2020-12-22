package com.testCAS;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

public class testCAS {
	@Test
	public void testCas() {
		//创建AtomicInteger对象，初始值为5，
		//此时主内存的AtomicInteger为5，main线程的工作内存AtomicInteger也为5
		AtomicInteger atomicInteger = new AtomicInteger(5);

		//main线程做一些业务逻辑。。。。。

		//main线程要对AtomicInteger修改前先要判断AtomicInteger在主内存的值是否发生过改变
		//若主内存的值还是5，则进行set，若主内存的值已经不是5，则放弃set
		boolean b1 = atomicInteger.compareAndSet(5, 6);
		if (b1) {
			System.out.println("b1 = " + b1 + "     atomicInteger=" + atomicInteger.get());
		}else {
			System.out.println("现在主内存的值已经不为5");
		}

		boolean b2 = atomicInteger.compareAndSet(5, 7);
		if (b2) {
			System.out.println("b2 = " + b2 + "     atomicInteger=" + atomicInteger.get());
		}else {
			System.out.println("b2 = " + b2 + "     atomicInteger=" + atomicInteger.get());
			System.out.println("现在主内存的值已经不为5");
		}

	}
}
