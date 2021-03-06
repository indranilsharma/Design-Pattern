package com.designPatern.CreationalDesignPatterns.PrototypePattern;

import java.util.Arrays;

class B_Address implements Cloneable {

	public String streetAddess;
	public int houseNumber;

	public B_Address(String streetAddess, int houseNumber) {
		super();
		this.streetAddess = streetAddess;
		this.houseNumber = houseNumber;
	}

	@Override
	public String toString() {
		return "[streetAddess=" + streetAddess + ", houseNumber=" + houseNumber + "]";
	}

//	 Deep copy
	@Override
	public Object clone() throws CloneNotSupportedException {
		return new B_Address(streetAddess, houseNumber);
	}
}

class Person implements Cloneable {

	public String[] names;
	public String name;
	public B_Address Address;

	public Person(String[] names, B_Address address) {
		this.names = names;
		this.Address = address;
	}

	@Override
	public String toString() {
		return "Person [names=" + Arrays.toString(names) + ", Address=" + Address + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Person(names.clone(), (B_Address) Address.clone());
//		return new Person(name.clone());

	}
}

public class B_Clonable {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person tom = new Person(new String[] { "Tom brigenza" }, new B_Address("Behala", 57));
		Person gomez = (Person) tom.clone();
		gomez.names[0] = "Gomez Carry";
//		only part i am changing not whole address (houseNumber only chang)
		gomez.Address.houseNumber = 58;
		System.out.println(tom);
		System.out.println(gomez);

	}
}