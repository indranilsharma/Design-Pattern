package com.designPatern.CreationalDesignPatterns.Singleton;

class Innner_Static_Sinleton {

	private Innner_Static_Sinleton() {
	}

	private static class Impl {
		private static Innner_Static_Sinleton INSTANCE = new Innner_Static_Sinleton();
	}

	public static Innner_Static_Sinleton getInstance() {
		return Impl.INSTANCE;
	}
	
	
	private int value = 0;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}

public class B_Innner_Static_Singleton {
	public static void main(String[] args) {
		Innner_Static_Sinleton obj = Innner_Static_Sinleton.getInstance();
		obj.setValue(555);
		System.out.println(obj.getValue());
	}
}
