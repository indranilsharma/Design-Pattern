package com.designPatern.CreationalDesignPatterns.FactoryPattern.factoryMethod_Pattren;

public class A_Test_Computer_Factory {

	// ComputerFactory factory;

	public static void main(String[] args) {
		A_ComputerFactory cf = new A_ComputerFactory();
		A_Computer pc = A_ComputerFactory.getComputer("PC", "2GB", "4GHz", "1TB");
		A_Computer server = A_ComputerFactory.getComputer("SERVER", "4GB", "3.6GHz", "500GB");
		System.out.println("PC config :" + pc);
		System.out.println("SERVER config :" + server);
	}
}