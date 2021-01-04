package com.config;

import com.AOP.AspectsClass;
import com.AOP.MathCalculator;
import org.springframework.context.annotation.*;

@EnableAspectJAutoProxy//作用：开启切面功能
@Configuration
public class ConfigClass {

	@Bean
	public MathCalculator mathCalculator(){
		return new MathCalculator();
	}

	@Bean
	public AspectsClass aspectsClass(){
		return new AspectsClass();
	}
}



