package telkoProject;

import java.time.LocalDate;

public class Invoice {
private int id;
private LocalDate dateCreated;
private LocalDate dueDate;
private Subscription subscription;
private String invoinceNumber;

public Invoice(int id, LocalDate dateCreated, LocalDate dueDate, Subscription subscription,String invoinceNumber) {
	super();
	this.id = id;
	this.dateCreated = dateCreated;
	this.dueDate = dueDate;
	this.subscription = subscription;
	this.invoinceNumber=invoinceNumber;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public LocalDate getDateCreated() {
	return dateCreated;
}
public void setDateCreated(LocalDate dateCreated) {
	this.dateCreated = dateCreated;
}
public LocalDate getDueDate() {
	return dueDate;
}
public void setDueDate(LocalDate dueDate) {
	this.dueDate = dueDate;
}
public Subscription getSubscription() {
	return subscription;
}
public void setSubscription(Subscription subscription) {
	this.subscription = subscription;
}
public String getInvoinceNumber() {
	return invoinceNumber;
}
public void setInvoinceNumber(String invonceNumber) {
	this.invoinceNumber = invonceNumber;
}
}
