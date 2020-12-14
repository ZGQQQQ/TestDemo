package com.Demo.saleTicketDemo.useRunnable;

class Ticket implements Runnable {
	private int ticketNum = 5;

	@Override
	public void run() {
		while (true) {
			if (ticketNum > 0) {
				System.out.println(Thread.currentThread().getName() + "线程卖的第" + ticketNum-- + "号票");
			} else
				break;
		}
	}
}
