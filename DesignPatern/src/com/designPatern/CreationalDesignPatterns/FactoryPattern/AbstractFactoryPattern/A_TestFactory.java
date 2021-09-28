package com.designPatern.CreationalDesignPatterns.FactoryPattern.AbstractFactoryPattern;

public class A_TestFactory {

	private static void testFactory() {
		A_SuperClass subClassOne = A_ConsumerClas_s
				.getSuperClass(new A_SubClassOneFactory("propertyOne:1", "propertyTwo:2"));
		System.out.println("SuperClassFactory Subclass" + subClassOne);

		A_SuperClass subClassTwo = A_ConsumerClas_s
				.getSuperClass(new A_SubClassTwoFactory("propertyOne:1", "propertyOne:2"));
		
		System.out.println("SuperClassFactory Subclass" + subClassTwo);
	}

	public static void main(String[] args) {
		testFactory();
	}

}
