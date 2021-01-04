package com.entity;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car  implements InitializingBean, DisposableBean {
	public Car(){
		System.out.println("执行构造方法执行");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("使用方式二配置的初始化方法执行");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("使用方式二配置的销毁方法执行");
	}
}
