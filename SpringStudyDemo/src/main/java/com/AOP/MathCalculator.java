package com.AOP;

public class MathCalculator {
	/**目标方法*/
	public int div(int i, int j) {
		System.out.println("目标方法执行。。。。。");
		return i / j;
	}
}
