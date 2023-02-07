package com.miit.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppHelloWorld {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigHelloWorld.class);

		HelloWorld helloWorldBean = context.getBean("helloWorld", HelloWorld.class);
		helloWorldBean.sayHello();
		
		HelloWorld helloWorldBean1 = context.getBean("helloWorld", HelloWorld.class);
		if(helloWorldBean == helloWorldBean1) {
			System.out.println("both are equals::");
		}
		
	}
}
