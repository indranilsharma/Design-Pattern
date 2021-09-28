package com.designPatern.CreationalDesignPatterns.Singleton;

public class EagerInitialized {

	// protect object creation
	private EagerInitialized() {

	}

	// we can only used single instant other break it 2 step
	private static final EagerInitialized instance = new EagerInitialized();

	// outside can access this instance of the class
	public static EagerInitialized getInstance() {
		return instance;
	}
}
