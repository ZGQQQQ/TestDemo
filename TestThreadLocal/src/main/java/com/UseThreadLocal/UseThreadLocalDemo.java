package com.UseThreadLocal;

import org.junit.Test;

public class UseThreadLocalDemo {
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content=content;
	}
	@Test
	public void testMethod() throws Exception {
		//1-主线程过来创建TestThreadLocalDemo对象(    )
		UseThreadLocalDemo useThreadLocalDemo = new UseThreadLocalDemo();
		for (int i = 0; i < 10; i++) {
			//2-主线程在这创建新的线程    3-创建T1线程-->     5-创建T2线程-->
			Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
//					UseThreadLocalDemo useThreadLocalDemo = new UseThreadLocalDemo();
					//4-T1线程执行了这一行set代码，睡觉
					//5-T2线程执行了这一行set代码，睡觉  此时UseThreadLocalDemo对象的content属性的值就是t1线程设置的值，所有线程获得的值都是t13设置的值
					//出现这种情况的根本原因：UseThreadLocalDemo对象的content属性只有一个，这样后面线程set的值就把前面线程set的值覆盖了
					System.out.println(Thread.currentThread().getName() + "   set之前");
					useThreadLocalDemo.setContent(Thread.currentThread().getName() + "的数据");
					System.out.println(Thread.currentThread().getName() + "   set完毕");

					//这里睡一会的目的是让下一个线程set的值覆盖掉上一个线程设置的值
					try {Thread.sleep(1);} catch (Exception e) {}
					System.out.println(Thread.currentThread().getName() + "  get到的数据是  " + useThreadLocalDemo.getContent());
				}
			});

			thread.setName("我是线程" + i);//主线程执行
			thread.start();//主线程执行
		}

		System.out.println(Thread.currentThread().getName() + "  线程运行结束");
		Thread.sleep(10);
	}


}
