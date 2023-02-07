package com.miit.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Appmain {
	public static void main(String[] args) {
		// ApplicationContext context = new
		// AnnotationConfigApplicationContext(AppConfig.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

		/*
		 * ApplicationContext context = WebApplicationContexUtils
		 * .getRequiredWebApplicationContext(this.getServletContext());
		 * webcontext.getBean("messageUser");
		 */

		Toyota toyota = context.getBean("toyota", Toyota.class);
		// toyota.honk();
		toyota.startToyota();
		toyota.getEngine().startEngine();
		Toyota toyota1 = context.getBean("toyota", Toyota.class);

		if (toyota == toyota1)
			System.out.println("both are equals::");

		if (toyota.getEngine() == toyota1.getEngine())
			System.out.println("both Engines are equals::");
	}
}
