package com.BeanPostProcessorDemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	/**
	 * 该方法何时执行？在任何初始化方法(如使用前几种方式配置的初始化方法)被调用 前 执行；
	 * bean 相当于这里Car对象
	 * beanName Car对象在容器中的名字
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("使用方式四配置的初始化方法执行1");
		System.out.println(bean + "----" + beanName);
		return bean;
	}

	/**
	 *该方法何时执行？在任何初始化方法(如使用前几种方式配置的初始化方法)被调用 后 执行；
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("使用方式四配置的初始化方法执行2");
		System.out.println(bean + "----" + beanName);
		return bean;
	}
}
