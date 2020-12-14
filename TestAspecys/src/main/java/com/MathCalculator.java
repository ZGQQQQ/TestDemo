package com;

public class MathCalculator {

	@TestAOP
	public int add(int a, int b) {
		return a + b;
	}
}
