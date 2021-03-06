package com.designPatern.CreationalDesignPatterns.FactoryPattern.factoryMethod_Pattren;

import java.awt.Shape;

public class C_ShapeFactory {
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		else if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return (Shape) new C_Circle();
		}else if(shapeType.equalsIgnoreCase("")) {
			return  (Shape) new C_Square();
		}else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return (Shape) new C_Rectangle();
		}
		return null;
	}
}
