package com.designPatern.CreationalDesignPatterns.FactoryPattern.AbstractFactoryPattern;

public class A_SubClassOne extends A_SuperClass {

	private String propertyOne;

	private String propertyTwo;

	public A_SubClassOne(String propertyOne, String propertyTwo) {
		this.propertyOne = propertyOne;
		this.propertyTwo = propertyTwo;
	}

	@Override
	public String getProppertyOne() {
		return this.propertyOne;
	}

	@Override
	public String getProppertyTwo() {
		return this.propertyTwo;
	}

}
