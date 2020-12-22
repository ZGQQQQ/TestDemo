package com.Demo.saleTicketDemo.useRunnable;

class Ticket implements Runnable {
	private volatile int ticketNum = 20;
	@Override
	public void run() {
		while (true) {
			synchronized (this) {
			if (ticketNum > 0) {
				try {Thread.sleep(2);} catch (InterruptedException e) {e.printStackTrace();}
					System.out.println(Thread.currentThread().getName() + "线程卖的第" + ticketNum-- + "号票");
			} else
				break;
			}
		}
	}
}
