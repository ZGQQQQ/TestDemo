/*
package com.UseThreadLocal;

import org.junit.Test;

public class UseThreadLocalDemo02 {

	ThreadLocal<String> threadLocal = new ThreadLocal<>();

	public String getContent() {
		return threadLocal.get();
	}

	public void setContent(String content) {
		threadLocal.set(content);
	}
	@Test
	public void testMethod() throws Exception {
		//1-主线程过来创建TestThreadLocalDemo对象(    )
		UseThreadLocalDemo02 useThreadLocalDemo02 = new UseThreadLocalDemo02();
		for (int i = 0; i < 2; i++) {
			//2-主线程在这创建新的线程    3-创建T1线程-->     5-创建T2线程-->
			Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
					//4-T1线程执行了这一行set代码，睡觉
					//5-T2线程执行了这一行set代码，睡觉  此时UseThreadLocalDemo对象的content属性的值就是T3线程设置的值，所有线程获得的值都是T3设置的值
					System.out.println(Thread.currentThread().getName() + "   set之前");
					useThreadLocalDemo02.setContent(Thread.currentThread().getName() + "的数据");
					System.out.println(Thread.currentThread().getName() + "   set完毕");

					//这里睡一会的目的是让下一个线程set的值覆盖掉上一个线程设置的值
					try {Thread.sleep(1);} catch (Exception e) {}
					System.out.println(Thread.currentThread().getName() + "  get到的数据是  " + useThreadLocalDemo02.getContent());
				}
			});

			thread.setName("我是线程" + i);//主线程执行
			thread.start();//主线程执行
		}


		System.out.println(Thread.currentThread().getName() + "  线程运行结束");
		//让主线程睡10秒
		Thread.sleep(5);
	}
}
*/
