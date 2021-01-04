package com.test;

import com.AOP.MathCalculator;
import com.config.ConfigClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMethod {
	@Test
	public void test() {
		//创建IOC容器
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigClass.class);

		MathCalculator bean = applicationContext.getBean(MathCalculator.class);
		bean.div(1,1);
	}
}
