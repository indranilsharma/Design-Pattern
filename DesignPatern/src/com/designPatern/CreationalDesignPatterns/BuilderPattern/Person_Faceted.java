package com.designPatern.CreationalDesignPatterns.BuilderPattern;

public class Person_Faceted {

	// address
	public String steetAddress, postcode, city;

	// employment
	public String companyName, position;
	public int annualIncome;

	@Override
	public String toString() {
		return "Person_Faceted [steetAddress=" + steetAddress + ", postcode=" + postcode + ", city=" + city
				+ ", companyName=" + companyName + ", position=" + position + ", annualIncome=" + annualIncome + "]";
	}
}

//builder facade
class PersonBuilder_Facede {
	protected Person_Faceted person = new Person_Faceted();

	public PersonAddressBuilder lives() {
		return new PersonAddressBuilder(person);
	}

	public PersonJobbuilder works() {
		return new PersonJobbuilder(person);
	}

	public Person_Faceted build() {
		return person;
	}
}

class PersonAddressBuilder extends PersonBuilder_Facede {

	public PersonAddressBuilder(Person_Faceted person) {
		this.person = person;
	}

	public PersonAddressBuilder at(String streetAddess) {
		person.steetAddress = streetAddess;
		return this;
	}

	public PersonAddressBuilder withPostCode(String postcode) {
		person.postcode = postcode;
		return this;
	}

	public PersonAddressBuilder in(String city) {
		person.city = city;
		return this;
	}
}

class PersonJobbuilder extends PersonBuilder_Facede {

	public PersonJobbuilder(Person_Faceted person) {
		this.person = person;
	}

	public PersonJobbuilder at(String companyName) {
		person.companyName = companyName;
		return this;
	}

	public PersonJobbuilder asA(String position) {
		person.position = position;
		return this;
	}

	public PersonJobbuilder earning(int annualIncome) {
		person.annualIncome = annualIncome;
		return this;
	}
}

class Demo_Person_Faceted_Builder {
	public static void main(String[] args) {
		PersonBuilder_Facede pb = new PersonBuilder_Facede();

//		 we can jump one builder to other builder
		Person_Faceted person = pb
				.lives().at("57/2 Adarshanagar east").withPostCode("700061").in("Kolkata")
				.works().at("TCS").asA("SSE").earning(82000).build();
		System.out.println(person);
	}
}
