package com.designPatern.CreationalDesignPatterns.FactoryPattern.factoryMethod_Pattren;

public class C_Test_Shape_Factory {

	public static void main(String[] args) {
		C_ShapeFactory sf = new C_ShapeFactory();
		C_Shape shape1 = (C_Shape) sf.getShape("RECTANGLE");
//		 method not expose 
		shape1.draw();
		C_Shape shape2 = (C_Shape) sf.getShape("circle");
		shape2.draw();
	}

}
