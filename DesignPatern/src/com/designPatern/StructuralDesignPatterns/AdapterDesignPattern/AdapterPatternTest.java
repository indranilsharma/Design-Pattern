package com.designPatern.StructuralDesignPatterns.AdapterDesignPattern;

public class AdapterPatternTest {
	public static void main(String[] args) {
		testClassAdapter();
		testObjectAdapter();
	}

	private static void testObjectAdapter() {
		SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
		Volt v3 = getVolt(sockAdapter, 3);
		Volt v12 = getVolt(sockAdapter, 12);
		Volt v120 = getVolt(sockAdapter, 120);
		System.out.println("v3 volts using ObjectAdapter=" + v3.getPower());
		System.out.println("v12 volts using ObjectAdapter=" + v12.getPower());
		System.out.println("v120 volts using ObjectAdapter=" + v120.getPower());
	}

	private static void testClassAdapter() {
		SocketAdapter sockAdapter = new SocketClassAdapterImpl();
		Volt v3 = getVolt(sockAdapter, 3);
		Volt v12 = getVolt(sockAdapter, 12);
		Volt v120 = getVolt(sockAdapter, 120);
		System.out.println("v3 volts using ClassAdapter=" + v3.getPower());
		System.out.println("v12 volts using ClassAdapter=" + v12.getPower());
		System.out.println("v120 volts using ClassAdapter=" + v120.getPower());
	}

	private static Volt getVolt(SocketAdapter sockAdapter, int i) {
		switch (i) {
		case 3:
			return sockAdapter.get3Power();
		case 12:
			return sockAdapter.get12Power();
		case 120:
			return sockAdapter.get120Power();
		default:
			return sockAdapter.get120Power();
		}
	}
}
