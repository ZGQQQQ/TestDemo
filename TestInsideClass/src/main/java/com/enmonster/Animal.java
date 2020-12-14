package com.enmonster;

public class Animal {

	private Animal() {
	}

	//静态内部类1
	public static class Dog {
		private Dog() {
		}

		private static final String DAG_COLOR1 = "DOG_COLOR1:%s";
		public static final String DAG_COLOR2 = "DOG_COLOR2:%s";

	}

	//静态内部类2
	public static class Cat {

		public static class Cat1 {
			public static final String CAT1_COLOR2 = "CAT1_COLOR1:%s";
		}


	}


}
