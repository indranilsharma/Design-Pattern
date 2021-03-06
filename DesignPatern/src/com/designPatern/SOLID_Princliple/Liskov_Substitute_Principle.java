package com.designPatern.SOLID_Princliple;

class Rectangle {
	protected int height, width;

	public Rectangle() {
		super();
	}

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWeitdh(int width) {
		this.width = width;
	}

	public int getArea() {
		return height * width;
	}

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", weitdh=" + width + "]";
	}

	public boolean isSquare() {
		return width == height;
	}
}

class RectangleFactory {
	public Rectangle newRectangle(int width, int height) {
		return new Rectangle(width, height);
	}

	public Square newSquare(int side) {
		return new Square(side);
	}
}

class Square extends Rectangle {

	public Square() {
	}

	public Square(int height, int width) {
		super(height, width);
	}

	public Square(int size) {
		width = height = size;
	}

	@Override
	public void setHeight(int height) {
		super.setHeight(height);
		super.setWeitdh(height);
	}

	@Override
	public void setWeitdh(int width) {
		super.setWeitdh(width);
		super.setHeight(width);
	}
}

public class Liskov_Substitute_Principle {

	static void useIt(Rectangle r) {
		int width = r.getWidth();
		r.setHeight(10);
		System.out.println("Expected area of " + (width * 10) + ", got " + r.getArea());
	}

	public static void main(String[] args) {
		Rectangle rc = new Rectangle(2, 3);
		useIt(rc);

		Rectangle sq = new Square();
		sq.setHeight(5);
		sq.setWeitdh(10);
		useIt(sq);
	}

}
