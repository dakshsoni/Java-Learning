package com.design.patterns.creational;

public class SingletonDesignPattern {
	
	
	private int age;
	private String name;
	private static SingletonDesignPattern singletonDesignPattern;
	
	private SingletonDesignPattern(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	
	public static SingletonDesignPattern getInstance(int age, String name) {
		
		
		if(singletonDesignPattern == null) {
			
			singletonDesignPattern =  new SingletonDesignPattern(age, name);
		}
		
		return singletonDesignPattern;
		
		
	}

	@Override
	public String toString() {
		return "SingletonDesignPattern [age=" + age + ", name=" + name + "]";
	}
	
	
		

}
