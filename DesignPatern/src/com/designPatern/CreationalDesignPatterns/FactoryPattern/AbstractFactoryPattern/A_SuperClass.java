package com.designPatern.CreationalDesignPatterns.FactoryPattern.AbstractFactoryPattern;

public abstract class A_SuperClass {

	public abstract String getProppertyOne();

	public abstract String getProppertyTwo();

	@Override
	public String toString() {
		return "SuperClass [getProppertyOne()=" + getProppertyOne() + ", getProppertyTwo()=" + getProppertyTwo() + "]";
	}

}
