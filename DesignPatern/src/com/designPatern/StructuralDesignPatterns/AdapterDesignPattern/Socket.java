package com.designPatern.StructuralDesignPatterns.AdapterDesignPattern;

public class Socket {
	public Volt getPower() {
		return new Volt(120);
	}
}
