package com.design.patterns.creational;

public class SingletonDesignPatternUsingSyncronization {

	private int age;
	private String name;
	private static SingletonDesignPatternUsingSyncronization singletonDesignPatternUsingSyncronization;

	private SingletonDesignPatternUsingSyncronization(int age, String name) {
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

	public static SingletonDesignPatternUsingSyncronization getInstance(int age, String name) {

		if (singletonDesignPatternUsingSyncronization == null) {

			synchronized (SingletonDesignPatternUsingSyncronization.class) {
				
				if (singletonDesignPatternUsingSyncronization == null) {

					singletonDesignPatternUsingSyncronization = new SingletonDesignPatternUsingSyncronization(age, name);
				}
			}

			
		}

		return singletonDesignPatternUsingSyncronization;

	}

}
