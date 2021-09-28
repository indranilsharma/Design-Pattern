package com.designPatern.CreationalDesignPatterns.FactoryPattern.factoryMethod_Pattren;

public abstract class A_Computer {

	public abstract String getRAM();

	public abstract String getCPU();

	public abstract String getHD();

	@Override
	public String toString() {
		return "Computer [getRAM()=" + getRAM() + ", getCPU()=" + getCPU() + ", getHD()=" + getHD();

	}

}
