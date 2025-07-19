package com.design.patterns.creational;

import java.util.concurrent.atomic.AtomicReference;

public class SingletonDesignPatternThreadSafeAutmocReference {

	private int age;
	private String name;
	private static final AtomicReference<SingletonDesignPatternThreadSafeAutmocReference> AUTOMIC_ATOMIC_REFERENCE = new AtomicReference<>();

	private SingletonDesignPatternThreadSafeAutmocReference(int age, String name) {
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

	public static SingletonDesignPatternThreadSafeAutmocReference getInstance(int age, String name) {

		if (AUTOMIC_ATOMIC_REFERENCE.get() == null) {

			AUTOMIC_ATOMIC_REFERENCE.set(new SingletonDesignPatternThreadSafeAutmocReference(age, name));
		}

		return AUTOMIC_ATOMIC_REFERENCE.get();

	}

	@Override
	public String toString() {
		return "SingletonDesignPatternThreadSafeAutmocReference [age=" + age + ", name=" + name + "]";
	}
	
	

}
