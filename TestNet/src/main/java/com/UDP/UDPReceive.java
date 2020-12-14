package com.UDP;

import org.junit.Test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceive {
	@Test
	public void receiveMethod() throws Exception {
		System.out.println("接收端启动。。。");
		//创建接收对象
		DatagramSocket datagramSocket = new DatagramSocket(1000);
		//创建接收数据对象
		byte[] bytes = new byte[1024];
		DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
		//调用接收对象的receive方法  阻塞方法
		datagramSocket.receive(datagramPacket);
		//看接收的内容
		System.out.println(datagramPacket.getAddress().getHostAddress());
		String s = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
		System.out.println(s);
	}
}
