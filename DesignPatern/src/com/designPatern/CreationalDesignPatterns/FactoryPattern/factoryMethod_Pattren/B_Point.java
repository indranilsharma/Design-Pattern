package com.designPatern.CreationalDesignPatterns.FactoryPattern.factoryMethod_Pattren;

public class B_Point {
	private double x, y;

//private because out side not object creation not possible	
	private B_Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public static class Factory {
// factory method
		public static B_Point newCartisanPoint(double x, double y) {
			return new B_Point(x, y);
		}

// factory method
		public static B_Point newScalarPoint(double rho, double theta) {
			return new B_Point(rho * Math.cos(theta), rho * Math.sin(theta));
		}
	}

	@Override
	public String toString() {
		return "[x = " + x + ", y = " + y + "]";
	}

}

class B_Demo {
	public static void main(String[] args) {
		B_Point cartisanPoint = B_Point.Factory.newCartisanPoint(5, 4);
		B_Point scalarPoint = B_Point.Factory.newScalarPoint(5, 4);

		System.out.println("cartisanPoint : "+cartisanPoint);
		System.out.println("scalarPoint : "+scalarPoint);
	}
}
