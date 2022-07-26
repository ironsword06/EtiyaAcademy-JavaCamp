package telkoProject;

public class Product {
private int id;
private String name;
private String brand;
private String serialNo;
public Product() {
	super();
}
public Product(int id, String name, String brand, String serialNo) {
	super();
	this.id = id;
	this.name = name;
	this.brand = brand;
	this.serialNo = serialNo;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getSerialNo() {
	return serialNo;
}
public void setSerialNo(String serialNo) {
	this.serialNo = serialNo;
}

}
