package com.designPatern.CreationalDesignPatterns.Singleton;

public class BillPughSingleton {
	// private static BillPughSingleton instance;
	private BillPughSingleton() {
	}

	private static class InnerHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getIntance() {
		return InnerHelper.INSTANCE;

	}
}