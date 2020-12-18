package com.Demo.saleTicketDemo.useThread;

public class SaleTicket {
	public static void main(String[] args) {
		//因为Ticket继承了Thread，所以new Ticket()在创建线程的同时也明确了线程所要执行的任务
		Ticket ticket1 = new Ticket();
		Ticket ticket2 = new Ticket();
		ticket1.start();
		ticket2.start();
	}
}
