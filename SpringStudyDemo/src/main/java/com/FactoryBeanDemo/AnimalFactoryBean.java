package com.FactoryBeanDemo;

import com.entity.Dog;
import org.springframework.beans.factory.FactoryBean;

public class AnimalFactoryBean implements FactoryBean<Dog> {
	//该方法返回一个Dog对象，这个对象会添加到容器中
	@Override
	public Dog getObject() throws Exception {
		System.out.println("FactoryBean的getObject()方法被调用");
		return new Dog();
	}

	//该方法返回Dog对象的类型
	@Override
	public Class<?> getObjectType() {
		return Dog.class;
	}

	//该方法确定bean是否单例
	//true 表示这个bean是单实例，在容器中仅保存一份
	//false 表示这个bean是多实例，每次获取都会调用getObject()方法创建新的bean
	@Override
	public boolean isSingleton() {
		return true;
	}
}
