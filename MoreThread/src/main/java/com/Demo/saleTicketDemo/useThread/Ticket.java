package com.Demo.saleTicketDemo.useThread;

public class Ticket extends Thread {
	private int ticketNum = 5;

	public void run() {
		while (true) {
			if (ticketNum > 0) {
				System.out.println(Thread.currentThread().getName() + "线程卖的第" + ticketNum-- + "号票");
			} else
				break;
		}
	}
}
