package com.designPatern.CreationalDesignPatterns.Singleton;

class Basic_SingleTon {

//	 restrict outside access
	private Basic_SingleTon() {
	}

//	 only one copy can possible
	private static final Basic_SingleTon INSTANCE = new Basic_SingleTon();

//	 access of the instance 
	public static Basic_SingleTon getInstance() {
		return INSTANCE;
	}

	private int value = 0;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}

public class B_Basic_SingleTon {

	public static void main(String[] args) {
		
//		ant access from outside because it is private 
//		Basic_SingleTon obj = new Basic_SingleTon();
		
		Basic_SingleTon obj = Basic_SingleTon.getInstance();
		obj.setValue(555);
		System.out.println(obj.getValue());
	}
}
