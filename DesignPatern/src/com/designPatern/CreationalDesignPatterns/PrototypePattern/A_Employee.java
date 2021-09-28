package com.designPatern.CreationalDesignPatterns.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class A_Employee implements Cloneable {
	private List<String> empList;

	public List<String> getEmpList() {
		return empList;
	}

	public A_Employee() {
		empList = new ArrayList<>();
	}

	public A_Employee(List<String> list) {
		this.empList = list;
	}

	public void loadData() {
		empList.add("jhon");
		empList.add("jack");
		empList.add("soso");
		empList.add("kutti");

	}

	@Override
	
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for (String string : this.getEmpList()) {
			temp.add(string);
		}
		return new A_Employee(temp);
	}
}
