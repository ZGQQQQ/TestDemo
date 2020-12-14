package com.enmonster;

import org.junit.Test;

public class TestInsideClass {

	@Test
	public void testInside(){
		String s1=Animal.Dog.DAG_COLOR2;
		System.out.println(s1);

		String s2 = Animal.Cat.Cat1.CAT1_COLOR2;
		System.out.println(s2);

	}
}
