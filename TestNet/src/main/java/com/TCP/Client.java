package com.TCP;

import org.junit.Test;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

	@Test
	public void testClient() throws Exception {
		Socket socket = new Socket("192.168.171.1", 10005);
		OutputStream outStream = socket.getOutputStream();
		outStream.write("TCP客户端发送的内容：啊哈哈6666666666666666666666666666666哈哈".getBytes());

//		InputStream inStream = socket.getInputStream();
//		byte[] bytes = new byte[1024];
//		int read = inStream.read(bytes);
//		String s = new String(bytes, 0, read);
//		System.out.println(s);
		socket.close();
	}

	@Test
	public void test1() throws Exception{
		System.out.println(InetAddress.getLocalHost());
	}
}
