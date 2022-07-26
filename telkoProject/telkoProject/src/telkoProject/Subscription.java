package telkoProject;

import java.time.LocalDate;

public class Subscription {
private int id;
private LocalDate dateStarted;
private Service service;
private Customer customer;
public Subscription () {
	
}
public Subscription(int id, LocalDate dateStarted, Service service, Customer customer) {
	super();
	this.id = id;
	this.dateStarted = dateStarted;
	this.service = service;
	this.customer = customer;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public LocalDate getDateStarted() {
	return dateStarted;
}
public void setDateStarted(LocalDate dateStarted) {
	this.dateStarted = dateStarted;
}
public Service getService() {
	return service;
}
public void setService(Service service) {
	this.service = service;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}

}
