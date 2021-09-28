package com.designPatern.CreationalDesignPatterns.FactoryPattern.AbstractFactoryPattern;

public class B_ShapeFactory extends B_AbstractFactory{

	@Override
	B_Shape getShape(String shapeType) {
		 if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new B_Rectangle();         
	      }else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new B_Square();
	      }	 		return null;
	}

}
