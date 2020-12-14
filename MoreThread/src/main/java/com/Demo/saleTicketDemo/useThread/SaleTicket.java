package com.Demo.saleTicketDemo.useThread;

public class SaleTicket {
	public static void main(String[] args) {
		Ticket ticket1 = new Ticket();
		Ticket ticket2 = new Ticket();
		ticket1.start();
		ticket2.start();
	}
}
