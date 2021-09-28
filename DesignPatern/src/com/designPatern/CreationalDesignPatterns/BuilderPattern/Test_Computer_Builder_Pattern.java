package com.designPatern.CreationalDesignPatterns.BuilderPattern;

public class Test_Computer_Builder_Pattern {
	public static void main(String[] args) {
		ComputerClass_Builder_pattern computerClass = new ComputerClass_Builder_pattern
				.ComputerBuilder("500GB", "HP")
				.setBlothoothEnable(true)
				.setCameraEnable(true).build();
		System.out.println(computerClass.toString());
	}
}
