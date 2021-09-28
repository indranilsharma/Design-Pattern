package com.designPatern.CreationalDesignPatterns.Singleton;

public class Staticblockinitialization {

	// create variable of class type
	private static Staticblockinitialization instance;

	// private constractor try to protect unessary object creation
	private Staticblockinitialization() {
	}

	// object creation in static block as well as exeption handling
	static {
		try {
			instance = new Staticblockinitialization();
		} catch (Exception ex) {
			throw new RuntimeException("Object creation at runtime geting exception");
		}

	}

	public static Staticblockinitialization getInstance() {
		return instance;
	}
}
