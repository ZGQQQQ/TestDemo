package com.UDP;

import org.junit.Test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSend {
	@Test
	public void sendMethod() throws Exception {
		System.out.println("发生端启动。。");
		//创建发送对象
		DatagramSocket datagramSocket = new DatagramSocket();
		//准备发送数据
		String str = "UDP发来的内容: 保罗CP3。";
		byte[] bytes = str.getBytes();
		DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.171.1"), 1000);
		//调用发送对象的send方法
		datagramSocket.send(datagramPacket);
		//关闭发送对象
		datagramSocket.close();
	}
}
