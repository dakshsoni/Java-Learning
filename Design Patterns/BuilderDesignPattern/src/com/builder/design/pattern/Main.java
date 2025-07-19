package com.builder.design.pattern;

public class Main {

	public static void main(String[] args) {

		BuilderDesignPatternComputer builderDesignPatternComputer1 = new BuilderDesignPatternComputer.Builder("8 GB",
				"256 GB", "Intel i5").build();
		BuilderDesignPatternComputer builderDesignPatternComputer2 = new BuilderDesignPatternComputer.Builder("10 GB",
				"1024 GB", "Intel i9").setIsGraphicCardSupport(true).setIsWifiSupport(true).build();
		
		System.out.println(builderDesignPatternComputer1);
		System.out.println(builderDesignPatternComputer2);

	}

}
