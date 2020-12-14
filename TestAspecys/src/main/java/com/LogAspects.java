package com;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class LogAspects {

	@Pointcut("@annotation(com.TestAOP)")
	public void logStart(){
	}

	@Around("logStart()")
	public void doSurroud(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		System.out.println("目标方法执行前");
		proceedingJoinPoint.proceed();
		System.out.println("目标方法执行结束");
	}



}
