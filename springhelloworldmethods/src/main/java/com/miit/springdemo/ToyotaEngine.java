package com.miit.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ToyotaEngine extends Engine {
	
	public void startEngine() {
		System.out.println("Engine is starting::");
	}

}
