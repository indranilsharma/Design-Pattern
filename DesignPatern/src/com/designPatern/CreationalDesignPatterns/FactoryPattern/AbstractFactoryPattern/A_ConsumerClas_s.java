package com.designPatern.CreationalDesignPatterns.FactoryPattern.AbstractFactoryPattern;

public class A_ConsumerClas_s {
	public static A_SuperClass getSuperClass(A_SuperClassFactory factory) {
		return factory.createSuperInstance();
	}
}
