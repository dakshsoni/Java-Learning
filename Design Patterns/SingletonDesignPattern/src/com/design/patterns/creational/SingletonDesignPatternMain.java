package com.design.patterns.creational;

/**

<h1> Singleton Design Pattern :</h1> <span>Ensures that a class has only one instance and provides a global point of access to it </span>

@author Deepak Soni
*/
public class SingletonDesignPatternMain {

	public static void main(String[] args) {

		SingletonDesignPattern singletonDesignPattern1 = SingletonDesignPattern.getInstance(28, "Deepak");
		SingletonDesignPattern singletonDesignPattern2 = SingletonDesignPattern.getInstance(27, "Deepak");

		System.out.println("singletonDesignPattern1 : " + System.identityHashCode(singletonDesignPattern1));
		System.out.println("singletonDesignPattern2 : " + System.identityHashCode(singletonDesignPattern2));
		System.out.println(singletonDesignPattern1 == singletonDesignPattern2);
		System.out.println(singletonDesignPattern1);
		System.out.println(singletonDesignPattern2);

		// Automic Reference check thread safe SingletonDesignPattern

		/*
		 * IntStream.range(0, 3).forEach(s -> {
		 * 
		 * Thread t = new Thread(() -> {
		 * 
		 * IntStream.range(0, 5).forEach(h -> {
		 * 
		 * int val = Integer.valueOf(h);
		 * 
		 * SingletonDesignPatternThreadSafeAutmocReference singletonDesignPattern =
		 * SingletonDesignPatternThreadSafeAutmocReference.getInstance(val, "Deepak");
		 * System.out.println("singletonDesignPattern_"+ val +" : " +
		 * System.identityHashCode(singletonDesignPattern));
		 * System.out.println(singletonDesignPattern);
		 * 
		 * }); });
		 * 
		 * t.start();
		 * 
		 * });
		 */

	}

}
