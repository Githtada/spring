package com.miit.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigHelloWorld {
	@Bean(name = "helloWorld")
	public HelloWorld getHelloWorld(){
		return new HelloWorld();
	}
}
