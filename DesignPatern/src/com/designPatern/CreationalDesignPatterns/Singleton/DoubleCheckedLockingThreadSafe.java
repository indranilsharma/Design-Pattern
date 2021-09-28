package com.designPatern.CreationalDesignPatterns.Singleton;

public class DoubleCheckedLockingThreadSafe {
	private static DoubleCheckedLockingThreadSafe instance;

	private DoubleCheckedLockingThreadSafe() {

	}

	public static DoubleCheckedLockingThreadSafe getInstance() {

		if (instance == null) {
			// we break synchronized block
			synchronized (DoubleCheckedLockingThreadSafe.class) {
				if (instance == null) {

					instance = new DoubleCheckedLockingThreadSafe();
				}
			}
		}

		return instance;
	}
}
