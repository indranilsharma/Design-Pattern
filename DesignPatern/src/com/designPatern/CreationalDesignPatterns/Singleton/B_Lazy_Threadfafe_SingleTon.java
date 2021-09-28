package com.designPatern.CreationalDesignPatterns.Singleton;

class LazyThreadfafe_SingleTon {
	private static LazyThreadfafe_SingleTon instance;

	private LazyThreadfafe_SingleTon() {
		System.out.println("initizing singleton");
	}

	public static LazyThreadfafe_SingleTon getInstance() {

		if (instance == null) {
			synchronized (LazyThreadfafe_SingleTon.class) {
				if (instance == null) {
					instance = new LazyThreadfafe_SingleTon();
				}
			}
		}
		return instance;
	}

	private int value = 0;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}

public class B_Lazy_Threadfafe_SingleTon {

	public static void main(String[] args) {
		LazyThreadfafe_SingleTon obj = LazyThreadfafe_SingleTon.getInstance();
		obj.setValue(555);
		System.out.println(obj.getValue());
	}

}
