package com.designPatern.StructuralDesignPatterns.DecoratorPattern;

interface Shape {
	String info();
}

class Circle implements Shape {

	private float radius;

	public Circle() {
	}

	public Circle(float radius) {
		this.radius = radius;
	}

	void resize(float factor) {
		radius *= factor;
	}

	@Override
	public String info() {
		return "A circle of radius " + radius;
	}
}

class Square implements Shape {

	private float side;

	public Square() {
	}

	public Square(float side) {
		super();
		this.side = side;
	}

	@Override
	public String info() {
		return "A square with side " + side;
	}
}

class ColoureShape implements Shape {

	private Shape shape;
	private String colour;

	public ColoureShape(Shape shape, String colour) {
		this.shape = shape;
		this.colour = colour;
	}

	@Override
	public String info() {
		return shape.info() + " has the color " + colour;
	}
}

class TransparentShape implements Shape {

	private Shape shape;
	private int transparency;

	public TransparentShape() {
	}

	public TransparentShape(Shape shape, int transparency) {
		this.shape = shape;
		this.transparency = transparency;
	}

	@Override
	public String info() {
		return shape.info() + " has " + transparency + "% transparency ";
	}

}

public class B_Dynamic_Decorator {
	public static void main(String[] args) {

		Circle circle = new Circle(100);
		System.out.println(circle.info());

		ColoureShape coloureShape = new ColoureShape(new Square(100), "red");
		System.out.println(coloureShape.info());

		TransparentShape transparentShape = new TransparentShape(new ColoureShape(new Circle(44), "Blue"), 500);
		System.out.println(transparentShape.info());
	}
}
