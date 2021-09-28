package com.designPatern.CreationalDesignPatterns.PrototypePattern;

class C_Address {

	public String streetAddess, city, country;

	public C_Address(String streetAddess, String city, String country) {
		this.streetAddess = streetAddess;
		this.city = city;
		this.country = country;
	}

//	Copy constructor 
	public C_Address(C_Address other) {
		this(other.streetAddess, other.city, other.country);
	}

	@Override
	public String toString() {
		return "C_Address [streetAddess=" + streetAddess + ", city=" + city + ", country=" + country + "]";
	}
}

class C_Employee {
	
	public String name;
	public C_Address address;

	public C_Employee(String name, C_Address address) {
		this.name = name;
		this.address = address;
	}

	public C_Employee(C_Employee other) {
		name = other.name;
		address = new C_Address(other.address);
	}

	@Override
	public String toString() {
		return "C_Employee [name=" + name + ", address=" + address + "]";
	}
	
}

public class C_Copy_Constuctor {
	public static void main(String[] args) throws CloneNotSupportedException {
		C_Employee jack = new C_Employee("Jack", new C_Address("152 Rafele Road", "Torento", "Canada"));
		C_Employee roccky = new C_Employee(jack);
		
		roccky.name = "Roccky Desuza";
		roccky.address.city = "hamshare";
		
		System.out.println(jack);
		System.out.println(roccky);
	}
}