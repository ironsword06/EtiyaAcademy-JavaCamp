package telkoProject;

import java.time.LocalDate;

public class Invoice {
private int id;
private LocalDate dateCreated;
private LocalDate dueDate;
private Subscription subscription;

public Invoice(int id, LocalDate dateCreated, LocalDate dueDate, Subscription subscription) {
	super();
	this.id = id;
	this.dateCreated = dateCreated;
	this.dueDate = dueDate;
	this.subscription = subscription;
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
}
