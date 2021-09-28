package com.designPatern.CreationalDesignPatterns.Singleton;

import java.io.File;
import java.io.IOException;

// if exception occurred how the situation are handled 
class StaticBlockSingleTon {

	public StaticBlockSingleTon() throws IOException {
		System.out.println("sinleTon is initilized");
		File.createTempFile(".", ".");
	}

	private static StaticBlockSingleTon instance;

	static {
		try {
			instance = new StaticBlockSingleTon();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static StaticBlockSingleTon getInstance() {
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

public class B_StaticBlockSingleTon {

	public static void main(String[] args) {
		StaticBlockSingleTon obj = StaticBlockSingleTon.getInstance();
		obj.setValue(555);
		System.out.println(obj.getValue());
	}
}
