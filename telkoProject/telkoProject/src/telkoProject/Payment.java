package telkoProject;

import java.time.LocalDate;

public class Payment {
private int id;
private PaymentType paymentType;
private Plan plan;
private LocalDate date;
public Payment() {
	super();
}
public Payment(int id, PaymentType paymentType, Plan plan, LocalDate date) {
	super();
	this.id = id;
	this.paymentType = paymentType;
	this.plan = plan;
	this.date = date;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public PaymentType getPaymentType() {
	return paymentType;
}
public void setPaymentType(PaymentType paymentType) {
	this.paymentType = paymentType;
}
public Plan getPlan() {
	return plan;
}
public void setPlan(Plan plan) {
	this.plan = plan;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
}
