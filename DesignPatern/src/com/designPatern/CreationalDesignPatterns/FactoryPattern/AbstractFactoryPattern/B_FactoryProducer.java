package com.designPatern.CreationalDesignPatterns.FactoryPattern.AbstractFactoryPattern;

public class B_FactoryProducer {
	public static B_AbstractFactory getFactory(boolean rounded) {
		if (rounded) {
			return new B_RoundedShapeFactory();
		} else {
			return new B_ShapeFactory();
		}
	}
}
