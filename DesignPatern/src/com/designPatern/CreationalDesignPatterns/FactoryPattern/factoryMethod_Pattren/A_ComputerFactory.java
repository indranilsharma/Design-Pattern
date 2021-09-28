package com.designPatern.CreationalDesignPatterns.FactoryPattern.factoryMethod_Pattren;

public class A_ComputerFactory {
	public static A_Computer getComputer(String type, String ram, String cpu, String hd) {

		if ("PC".equalsIgnoreCase("PC")) {
			return new A_PC(ram, cpu, hd);
		} else if ("SERVER".equalsIgnoreCase("SERVER")) {
			return new A_Server(ram, cpu, hd);
		}

		return null;
	}
}
