package com.TestARMCreateAdvert;


public class ARMCreateAdvert {

	public void test01() throws Exception {

		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(new ThreadDoWorker());//主线程创建线程
			thread.setName("我是线程(客户端)" + i);//主线程给线程设置线程名字
			thread.start();//主线程开启线程
		}
		Thread.sleep(100);

	}
}
