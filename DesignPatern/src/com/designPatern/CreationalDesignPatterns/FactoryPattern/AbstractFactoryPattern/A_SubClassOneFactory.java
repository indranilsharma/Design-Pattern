package com.designPatern.CreationalDesignPatterns.FactoryPattern.AbstractFactoryPattern;

public class A_SubClassOneFactory implements A_SuperClassFactory {

	private String propertyOne;
	private String propertyTwo;

	public A_SubClassOneFactory(String propertyOne, String propertyTwo) {
		//super();
		this.propertyOne = propertyOne;
		this.propertyTwo = propertyTwo;
	}

	@Override
	public A_SuperClass createSuperInstance() {
		return new A_SubClassOne("propertyOneInitisised", "propertyTwoInitisised");
	}

}
