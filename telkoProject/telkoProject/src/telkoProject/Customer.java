package telkoProject;

import java.util.List;

public class Customer {
private	int id;
private	String customerNumber;
private List<Address>address;
public Customer() {
	
}
public Customer(int id, String customerNumber,List<Address>address) {
	super();
	this.id = id;
	this.customerNumber = customerNumber;
	this.address=address;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getCustomerNumber() {
	return customerNumber;
}

public void setCustomerNumber(String customerNumber) {
	this.customerNumber = customerNumber;
}

}
