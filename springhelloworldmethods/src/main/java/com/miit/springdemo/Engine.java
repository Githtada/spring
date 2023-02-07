package com.miit.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Engine {
//engine	
	public void startEngine() {
		System.out.println("Engine is starting::");
	}

}
