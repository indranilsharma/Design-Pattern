package com.designPatern.StructuralDesignPatterns.AdapterDesignPattern;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

	@Override
	public Volt get120Power() {
		Volt volt = getPower();
		return convertVolt(getPower(), 12);
	}

	@Override
	public Volt get12Power() {
		Volt volt = getPower();

		return convertVolt(getPower(), 4);
	}

	@Override
	public Volt get3Power() {
		Volt volt = getPower();

		return convertVolt(getPower(), 3);
	}

	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getPower() / i);
	}
}
