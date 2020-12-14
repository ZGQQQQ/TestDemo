package com.UseThreadLocal;


import org.junit.Test;

public class UseThreadLocalDemo {
	ThreadLocal<String> threadLocal = new ThreadLocal<>();
	private String content;

	public String getContent() {
		return content;
//		return threadLocal.get();
	}

	public void setContent(String content) {
		this.content=content;
//		threadLocal.set(content);
	}
	@Test
	public void testMethod() throws Exception {
		//1-主线程过来创建TestThreadLocalDemo对象(    )
		UseThreadLocalDemo useThreadLocalDemo = new UseThreadLocalDemo();
		for (int i = 0; i < 2; i++) {
			//2-主线程在这创建新的线程    3-创建T1线程-->     5-创建T2线程-->
			Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
					//4-T1线程执行了这一行set代码，睡觉
					//5-T2线程执行了这一行set代码，睡觉  此时UseThreadLocalDemo对象的content属性的值就是T3线程设置的值，所有线程获得的值都是T3设置的值
					//T3线程执行了这一行set代码，睡觉  此时NoThreadLocalDemo对象的content属性的值就是T3线程设置的值，所有所有线程获得的值都是T3设置的值
					//出现这种情况的根本原因：NoThreadLocalDemo对象只有一个，这样后面线程set的值就把前面线程set的值覆盖了
					System.out.println(Thread.currentThread().getName() + "   set之前");
					useThreadLocalDemo.setContent(Thread.currentThread().getName() + "的数据");
					System.out.println(Thread.currentThread().getName() + "   set完毕");
					try {Thread.sleep(1);} catch (Exception e) {}
					System.out.println(Thread.currentThread().getName() + "  get到的数据是  " + useThreadLocalDemo.getContent());
				}
			});
			thread.setName("我是线程" + i);//主线程执行
			thread.start();//主线程执行
		}
		Thread.sleep(10);
	}


}
