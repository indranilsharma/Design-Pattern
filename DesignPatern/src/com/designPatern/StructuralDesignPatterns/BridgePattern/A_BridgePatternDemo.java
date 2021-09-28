package com.designPatern.StructuralDesignPatterns.BridgePattern;

public class A_BridgePatternDemo {

	public static void main(String[] args) {
		A_Shape redCircle = new A_Circle(100, 100, 10, new A_RedCircle());
		A_Shape greenCircle = new A_Circle(100, 100, 10, new A_GreenCircle());
		redCircle.draw();
		greenCircle.draw();
	}

}
