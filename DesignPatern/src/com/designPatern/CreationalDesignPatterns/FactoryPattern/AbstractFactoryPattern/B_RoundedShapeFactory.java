package com.designPatern.CreationalDesignPatterns.FactoryPattern.AbstractFactoryPattern;

public class B_RoundedShapeFactory extends B_AbstractFactory {

	@Override
	B_Shape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new B_RoundedRectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new B_RoundedSquare();
		}
		return null;
	}
}
