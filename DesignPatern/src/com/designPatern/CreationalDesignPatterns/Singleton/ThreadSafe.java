package com.designPatern.CreationalDesignPatterns.Singleton;

public class ThreadSafe {
	private static ThreadSafe instance;

	private ThreadSafe() {

	}

	//instance creation inside public method in synchronized manner 
	public static synchronized ThreadSafe getInstance() {

		if (instance == null) {
			instance = new ThreadSafe();
		}

		return instance;
	}
}
