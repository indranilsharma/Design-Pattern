package com.designPatern.CreationalDesignPatterns.FactoryPattern.AbstractFactoryPattern;

public class B_RoundedSquare implements B_Shape {

	@Override
	public void draw() {
		System.out.println("Inside RoundedSquare::draw() method.");
	}
}
