package com.designPatern.CreationalDesignPatterns.PrototypePattern;

import java.util.List;

public class A_TestPrototypePattern {
	public static void main(String[] args) throws CloneNotSupportedException {
		A_Employee employee = new A_Employee();
		employee.loadData();
		A_Employee cloneObj1 = (A_Employee) employee.clone();
		A_Employee cloneObj2 = (A_Employee) employee.clone();
		List<String> listTemp1 = cloneObj1.getEmpList();
		listTemp1.add("bichug");
		List<String> listTemp2 = cloneObj2.getEmpList();
		listTemp2.remove("jack");
		System.out.println(employee.getEmpList() + ": employee");
		System.out.println(listTemp1 + ": listTemp1");
		System.out.println(listTemp2 + ": listTemp2");
	}
}
