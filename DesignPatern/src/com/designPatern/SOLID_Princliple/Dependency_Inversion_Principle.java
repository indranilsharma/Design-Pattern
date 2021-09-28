package com.designPatern.SOLID_Princliple;

// A. High-level modules should not depend on low-level modules. 
// Both should depend on abstractions.

// B. Abstractions should not depend on details. 
// Details should depend on abstractions.

interface ICustomerDataAccess {
	String GetCustomerName(int id);
}

//high level class depends on abstuction (ICustomerDataAccess)

class CustomerDataAccess implements ICustomerDataAccess {
	public CustomerDataAccess() {
	}

	public String GetCustomerName(int id) {
		return "Dummy Customer Name";
	}
}

// low level class depends on abstuction 
class DataAccessFactory {
	public static ICustomerDataAccess getCustomerDataAccessObj() {
		return new CustomerDataAccess();
	}
}

//Also, the abstraction (ICustomerDataAccess) does not depend on details (CustomerDataAccess), 
//but the details depend on the abstraction.

class CustomerBusinessLogic {
	ICustomerDataAccess _custDataAccess;

	public CustomerBusinessLogic() {
		_custDataAccess = DataAccessFactory.getCustomerDataAccessObj();
	}

	public String GetCustomerName(int id) {
		return _custDataAccess.GetCustomerName(id);
	}
}

public class Dependency_Inversion_Principle {

	public static void main(String[] args) {

	}

}