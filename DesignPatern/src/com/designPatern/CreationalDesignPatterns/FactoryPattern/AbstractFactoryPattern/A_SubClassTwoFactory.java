package com.designPatern.CreationalDesignPatterns.FactoryPattern.AbstractFactoryPattern;

public class A_SubClassTwoFactory implements A_SuperClassFactory {

	private String propertyOne;
	private String propertyTwo;

	public A_SubClassTwoFactory(String propertyOne, String propertyTwo) {
		//super();
		this.propertyOne = propertyOne;
		this.propertyTwo = propertyTwo;
	}

	@Override
	public A_SuperClass createSuperInstance() {
		return new A_SubClassTwo("propertyOneInitisised", "propertyTwoInitisised");
	}

}
