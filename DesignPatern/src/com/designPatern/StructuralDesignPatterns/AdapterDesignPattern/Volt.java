package com.designPatern.StructuralDesignPatterns.AdapterDesignPattern;

public class Volt {
	private int power;

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public Volt(int power) {

		this.power = power;
	}

}
