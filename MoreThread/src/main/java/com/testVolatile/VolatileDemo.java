package com.testVolatile;

/*class Mydate implements Runnable {
	int number = 0;
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ">>>" + number);
		this.number = 17;
		System.out.println(Thread.currentThread().getName() + "<<<" + number);
	}
}*/

import java.util.concurrent.TimeUnit;

class Mydate  {
	/*volatile*/ int number = 0;
	public void changeNum() {
		System.out.println(Thread.currentThread().getName() + "2222222    " + number);
		this.number = 17;
		System.out.println(Thread.currentThread().getName() + "3333333    " + number);
	}
}
public class VolatileDemo {
	public static void main(String[] args) {
		Mydate mydate = new Mydate();
		System.out.println(Thread.currentThread().getName() + "############" + mydate.number);
		new Thread(()->{
			System.out.println(Thread.currentThread().getName() + "1111111    " + mydate.number);
			try{TimeUnit.SECONDS.sleep(3);}catch (InterruptedException e){e.printStackTrace();}
			mydate.changeNum();
			System.out.println(Thread.currentThread().getName() + "4444444    " + mydate.number);
		},"t1线程").start();

		while (mydate.number == 0) {
			//System.out.println(Thread.currentThread().getName() + "===============" + mydate.number);
//			System.out.println("----");
		}
		System.out.println(Thread.currentThread().getName() + "*****************************" + mydate.number);
	}
}



/*System.out.println(Thread.currentThread().getName() + "############" + mydate.number);
		Thread thread1 = new Thread(mydate);
		thread1.start();
		while (mydate.number == 0) {
			System.out.println(Thread.currentThread().getName() + "---" + mydate.number);
		}
		System.out.println(Thread.currentThread().getName() + "*****************************" + mydate.number);*/
