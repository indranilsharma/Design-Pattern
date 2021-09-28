package com.designPatern.StructuralDesignPatterns.BridgePattern;

public class A_Circle extends A_Shape {
	public A_Circle(int x, int y, int radius, A_Drawing drawing) {
		super(drawing);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	private int x, y, radius;

	@Override
	public void draw() {
		drawing.drawCircle(radius, x, y);
	}
}
