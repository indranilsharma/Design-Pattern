package com.designPatern.CreationalDesignPatterns.FactoryPattern.AbstractFactoryPattern;

public class B_Test {

	public static void main(String[] args) {
		// get shape factory
		B_AbstractFactory shapeFactory = B_FactoryProducer.getFactory(false);
		
		// get an object of Shape Rectangle
		B_Shape shape1 = shapeFactory.getShape("RECTANGLE");
		
		// call draw method of Shape Rectangle
		shape1.draw();
		
		// get an object of Shape Square
		B_Shape shape2 = shapeFactory.getShape("SQUARE");
		
		// call draw method of Shape Square
		shape2.draw();
		
		// get shape factory
		B_AbstractFactory shapeFactory1 = B_FactoryProducer.getFactory(true);
		
		// get an object of Shape Rectangle
		B_Shape shape3 = shapeFactory1.getShape("RECTANGLE");
		
		// call draw method of Shape Rectangle
		shape3.draw();
		
		// get an object of Shape Square
		B_Shape shape4 = shapeFactory1.getShape("SQUARE");
		
		// call draw method of Shape Square
		shape4.draw();
	}
}
