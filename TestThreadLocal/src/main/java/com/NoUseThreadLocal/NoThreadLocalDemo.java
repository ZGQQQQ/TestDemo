package com.NoUseThreadLocal;

import org.junit.Test;

public class NoThreadLocalDemo {
	private String content;

	@Test
	public void testMethod() throws Exception {
//		//主线程过来创建TestThreadLocalDemo对象(TestThreadLocalDemo对象自始至终只有一个)
//		NoThreadLocalDemo noThreadLocalDemo = new NoThreadLocalDemo();
//
//		for (int i = 0; i < 3; i++) {
//			//主线程在这创建新的线程
//			//创建T1线程
//			//创建T2线程
//			Thread thread = new Thread(new Runnable() {
//				@Override
//				public void run() {
//					//T1线程执行了这一行set代码，睡觉
//					//T2线程执行了这一行set代码，睡觉
//					//T3线程执行了这一行set代码，睡觉  此时NoThreadLocalDemo对象的content属性的值就是T3线程设置的值，所有线程获得的值都是T3设置的值
//					//出现这种情况的根本原因：NoThreadLocalDemo对象只有一个，这样后面线程set的值就把前面线程set的值覆盖了
//					noThreadLocalDemo.setContent(Thread.currentThread().getName() + "的数据");
//					System.out.println(Thread.currentThread().getName()+"   set完毕");
//					try { Thread.sleep(1);} catch (Exception e) {}
//					System.out.println(Thread.currentThread().getName() + "  get到的数据是  " + noThreadLocalDemo.getContent());
//				}
//			});
//
//			thread.setName("我是线程" + i);//主线程执行
//			thread.start();//主线程执行
//		}
//		Thread.sleep(10);
	}


	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
