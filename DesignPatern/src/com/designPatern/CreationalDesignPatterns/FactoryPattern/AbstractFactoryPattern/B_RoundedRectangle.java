package com.designPatern.CreationalDesignPatterns.FactoryPattern.AbstractFactoryPattern;

public class B_RoundedRectangle implements B_Shape {

	@Override
	public void draw() {
		System.out.println("Inside RoundedRectangle::draw() method.");
	}
}
