package com;

public class Person extends Object{
	final String str1 = "abc1"; //1-定义时初始化
	final String str2;
	final String str3;

	{
		//2-在非静态初始化块中为final实例变量指定初始值
		str2 = "abc2";
		//this.str2="abc2"; 也可以
	}

	//3-在构造器中指定初始值
	public Person() {
		str3 = "abc3";
		//this.str3="abc3"; 也可以
	}

}



