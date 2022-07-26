package ws3;

public class User {
private int id;
private String firstName;
private String lastName;
private NotificationService notificationService;

public User(int id, String firstName, String lastName, NotificationService notificationService) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.notificationService = notificationService;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public NotificationService getNotificationService() {
	return notificationService;
}
public void setNotificationService(NotificationService notificationService) {
	this.notificationService = notificationService;
}

}
