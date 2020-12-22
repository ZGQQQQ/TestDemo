package com.testCAS;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicStampedReference;

public class TestABA {
	AtomicStampedReference<Integer> asr = new AtomicStampedReference<>(100, 1);
	@Test
	public void testABAMethod(){
		new Thread(()->{
			System.out.println(Thread.currentThread().getName()+" 第1次版本号："+asr.getStamp());
			//这里让t1线程睡1秒的目的是让t2线程能拿到最初的版本号
			try {Thread.sleep(1);	} catch (InterruptedException e) {e.printStackTrace();}
			//下面t1线程执行A->B->A操作
			asr.compareAndSet(100, 101, asr.getStamp(), asr.getStamp() + 1);
			System.out.println("现在的版本号为：" + asr.getStamp());
			asr.compareAndSet(101, 100, asr.getStamp(), asr.getStamp() + 1);
			System.out.println("现在的版本号为：" + asr.getStamp());
		},"t1线程").start();

		new Thread(()->{
			int stamp = asr.getStamp();
			System.out.println(Thread.currentThread().getName() + " 第1次版本号：" + stamp);
			//这里让t2线程睡3秒的目的是让t1线程完成ABA操作
			try {Thread.sleep(3);	} catch (InterruptedException e) {e.printStackTrace();}
			boolean b = asr.compareAndSet(100, 2020, stamp, stamp + 1);
			if (b) {
				System.out.println("t2线程修改成功");
			} else {
				System.out.println("t2线程修改失败，现在的值为" + asr.getReference() + "版本号为：" + asr.getStamp());
			}
		},"t2线程").start();
	}
}
