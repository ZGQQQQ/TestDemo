package com.ImportUseDemo;

import com.entity.Cat;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class ImportBeanDefinitionRegistrarUse implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		//判断容器中Dog对象的名字是否为 com.entity.Dog
		boolean b = registry.containsBeanDefinition("com.entity.Dog");
		//若容器中Dog对象的名称为com.entity.Dog，才向容器中注册Cat对象
		if (b) {
			RootBeanDefinition rootBean = new RootBeanDefinition(Cat.class);
			//向spring容器注入bean
			registry.registerBeanDefinition("cat001", rootBean);
		}
	}
}
