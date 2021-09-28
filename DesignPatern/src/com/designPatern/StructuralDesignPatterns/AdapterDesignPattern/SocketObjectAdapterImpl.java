package com.designPatern.StructuralDesignPatterns.AdapterDesignPattern;

public class SocketObjectAdapterImpl implements SocketAdapter {

	private Socket sock = new Socket();

	@Override
	public Volt get120Power() {
		return sock.getPower();
	}

	@Override
	public Volt get12Power() {
		return sock.getPower();
	}

	@Override
	public Volt get3Power() {
		return sock.getPower();
	}

}
