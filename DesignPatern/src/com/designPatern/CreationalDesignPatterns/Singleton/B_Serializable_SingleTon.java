package com.designPatern.CreationalDesignPatterns.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Serializable_SingleTon implements Serializable {

	private static final long serialVersionUID = 15L;

//	 restrict outside access
	// * instance can be created deliberately (reflection)
	// * instance can be created accidentally (serialization)
	private Serializable_SingleTon() {
	}

//	 only one copy can possible
	private static final Serializable_SingleTon INSTANCE = new Serializable_SingleTon();

//	 if this method is not present we can break singleton nature 
	public Object readResolve() {
		return INSTANCE;
	}

//	 access of the instance 
	public static Serializable_SingleTon getInstance() {
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

public class B_Serializable_SingleTon {

	public static void saveToTheFile(Serializable_SingleTon obj, String fileName) throws IOException {
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
	}

	public static Serializable_SingleTon readFromFile(String fileName) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		return (Serializable_SingleTon) ois.readObject();
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {

//		ant access from outside because it is private 
//		Basic_SingleTon obj = new Basic_SingleTon();

		Serializable_SingleTon obj = Serializable_SingleTon.getInstance();

		obj.setValue(555);
		String fileName = "demo.txt";
		saveToTheFile(obj, fileName);

		obj.setValue(444);
		Serializable_SingleTon obj1 = readFromFile(fileName);

//		 if singleton it should be true ---but it comes false
		System.out.println(obj == obj1);

		System.out.println(obj1.getValue());
		System.out.println(obj.getValue());
	}
}
