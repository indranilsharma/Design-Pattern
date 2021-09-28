package com.designPatern.CreationalDesignPatterns.FactoryPattern.factoryMethod_Pattren;

public class A_Server extends A_Computer {

	public String ram;
	public String cpu;
	public String hd;

	public A_Server(String ram, String cpu, String hd) {
		//super();
		this.ram = ram;
		this.cpu = cpu;
		this.hd = hd;
	}

	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}

	@Override
	public String getHD() {
		return this.hd;
	}

}
