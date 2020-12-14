package com.TCP;

import org.junit.Test;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class Server {

	@Test
	public void testServer() throws Exception {
		ServerSocket serverSocket = new ServerSocket(10005);

		//获取客户端的socket对象
		//若有一个客户端连接成功会为其开启一个线程往下执行，主线程继续在这里等待新的客户端来连接
		System.out.println("等待连接。。。");
		Socket clientSocket = serverSocket.accept();//阻塞方法
		System.out.println("连接完成。。。");

		InputStream inStream = clientSocket.getInputStream();
		byte[] bytes = new byte[1024];

		System.out.println("连接成功，等待读取客户端的数据。。。");
		int read = inStream.read(bytes);//阻塞方法

		String s = new String(bytes, 0, read);
		System.out.println(s);


//		OutputStream outStream = clientSocket.getOutputStream();
//		outStream.write("服务端已收到".getBytes());

		inStream.close();
		serverSocket.close();
	}

	@Test
	public void testMethod() throws Exception{
		System.out.println(InetAddress.getLocalHost());

		System.out.println(InetAddress.getLocalHost().getHostAddress());

		System.out.println(InetAddress.getLocalHost().getHostName());
	}

}
