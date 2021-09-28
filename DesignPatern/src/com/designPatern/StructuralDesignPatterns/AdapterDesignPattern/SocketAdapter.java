package com.designPatern.StructuralDesignPatterns.AdapterDesignPattern;

public interface SocketAdapter {
	public Volt get120Power();

	public Volt get12Power();

	public Volt get3Power();
}
