package com.designPatern.StructuralDesignPatterns.BridgePattern;

public abstract class A_Shape {
	protected A_Drawing drawing;

	public A_Shape(A_Drawing drawing) {
		this.drawing = drawing;
	}

	public abstract void draw();
}
