package com.designPatern.StructuralDesignPatterns.BridgePattern;

public class A_RedCircle implements A_Drawing {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
	}
}
