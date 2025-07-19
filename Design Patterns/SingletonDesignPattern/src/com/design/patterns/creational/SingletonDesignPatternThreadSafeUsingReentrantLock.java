package com.design.patterns.creational;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SingletonDesignPatternThreadSafeUsingReentrantLock {

	private int age;
	private String name;
	private static SingletonDesignPatternThreadSafeUsingReentrantLock singletonDesignPatternThreadSafeUsingReentrantLock;

	private static final Lock reentrantLock = new ReentrantLock();

	private SingletonDesignPatternThreadSafeUsingReentrantLock(int age, String name) {
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

	public static SingletonDesignPatternThreadSafeUsingReentrantLock getInstance(int age, String name) {

		if (singletonDesignPatternThreadSafeUsingReentrantLock == null) {

			reentrantLock.lock();

			try {

				if (singletonDesignPatternThreadSafeUsingReentrantLock == null) {

					singletonDesignPatternThreadSafeUsingReentrantLock = new SingletonDesignPatternThreadSafeUsingReentrantLock(age, name);
				}

			} catch (Exception e) {

			} finally {

				reentrantLock.unlock();
			}
		}

		return singletonDesignPatternThreadSafeUsingReentrantLock;

	}

}
