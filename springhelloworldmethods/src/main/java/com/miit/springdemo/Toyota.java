package com.miit.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
/*
 * Singleton prototype request session globalsession
 */

/*
 * map.put("myBean", new Toyota()); map.put("engine", new Engine());
 */

public class Toyota implements BeanNameAware,BeanFactoryAware{
//implements BeanNameAware, BeanFactoryAware, ApplicationContextAware{
//toyota
	private String numberPlate;
	
	private int height;
	
	private int weight;
	
	private String beanName;
	
	
	private Engine engine;	
	
	@Autowired
	public Toyota(Engine engine) {
		this.engine = engine;
	}
	
	public String getNumberPlate() {
		return numberPlate;
	}

	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void startToyota() {
		engine.startEngine();
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
		System.out.println("name is:"+ name);
		
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		
	}	
	
	@PostConstruct
	public void init() {
		System.out.println("init Method:");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy Method:");
	}
	
	
}
