package com.Demo.synchronizedDemo;

/**
 * 让一个线程在同步函数里卖票；另一个线程在同步代码块里卖票
 * 若卖票不发生错误，则说明同步函数与同步代码块使用的是同一个锁
 */
class Ticket implements Runnable {
	private static int ticketNum = 10;
	Object obj = new Object();
	boolean flag = true;

	@Override
	public void run() {
		if (flag) {
			while (true) {
				synchronized (obj) {
					method();
				}
			}
		} else {
			while (true) {
				method();
			}
		}
	}

	//若同步函数加了static，那么该同步函数就不需要对象来调用，
	public synchronized void method() {
		synchronized (obj) {
			if (ticketNum > 0) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "线程卖的第" + ticketNum-- + "号票" + "同步函数");
			}
		}
	}
}
