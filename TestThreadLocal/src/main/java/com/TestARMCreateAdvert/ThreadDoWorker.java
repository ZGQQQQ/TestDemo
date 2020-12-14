package com.TestARMCreateAdvert;

/**
 * 用这个模拟controller
 */
public class ThreadDoWorker implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "来访问服务器");
		//------------------------------------模拟切面代码-----------------------------------------------
		Student student = new Student();//相当于：new AdvertSnapshotManager()
		ContentManagerHolder contentManagerHolder = new ContentManagerHolder();
		contentManagerHolder.setStudent(student);//相当于：this.advertSnapshotManager = manager
		//-----------------------------------------------------------------------------------------------
		Student student1 = contentManagerHolder.getStudent();
		student1.setName(Thread.currentThread().getName());
		try { Thread.sleep(2); } catch (Exception e) { }
		System.out.println(Thread.currentThread().getName()+"   "+contentManagerHolder.getStudent().getName());
	}
}
