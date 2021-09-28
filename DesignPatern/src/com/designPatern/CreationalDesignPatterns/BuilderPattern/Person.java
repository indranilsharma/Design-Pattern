package com.designPatern.CreationalDesignPatterns.BuilderPattern;

public class Person {
	public String name;

	public String position;

	@Override
	public String toString() {
		return "Person{" + "name='" + name + '\'' + ", position='" + position + '\'' + '}';
	}
}

class PersonBuilder<SELF extends PersonBuilder<SELF>> {
	protected Person person = new Person();

	public SELF withName(String name) {
		person.name = name;
		return self();
	}

	@SuppressWarnings("unchecked")
	protected SELF self() {
		return (SELF) this;
	}

	public Person build() {
		return person;
	}

}

class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {

	public EmployeeBuilder woksAt(String position) {
		person.position = position;
		return self();
	}

	@Override
	protected EmployeeBuilder self() {
		return this;
	}
}

class Demo {
	public static void main(String[] args) {
		EmployeeBuilder pb = new EmployeeBuilder();
		Person obj = pb.withName("indernil").woksAt("Full stack dev").build();
		System.out.println(obj);

	}
}
