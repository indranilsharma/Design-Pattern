package com.designPatern.CreationalDesignPatterns.Singleton;

public class LazyInitialized {

	// create variable of class type
	private static LazyInitialized instance;

	// private constructor try to protect unessery object creation
	private LazyInitialized() {

	}
     //create instance in public public method inside if block
	public LazyInitialized getInstance() {
		if (instance == null) {
			instance = new LazyInitialized();
		}
		return instance;
	}
}
