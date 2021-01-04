package com.AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectsClass {

	/**
	 * 该方法的作用：抽取公共的切入点表达式
	 */
	@Pointcut("execution(public int com.AOP.MathCalculator.*(..))")
	public void pointCut(){}

	/**
	 * 切入点的写法有如下2种方式：
	 *   （1）直接写上面方法的方法名
	 *   （2）写上面方法的全路径：com.AOP.AspectsClass.pointCut()
	 */
	@Before("pointCut()")
	public void targetMethodStart(){
		System.out.println("目标方法执行前");
	}

	@After("com.AOP.AspectsClass.pointCut()")
	public void targetMethodEnd(){
		System.out.println("目标方法执行结束");
	}
}

