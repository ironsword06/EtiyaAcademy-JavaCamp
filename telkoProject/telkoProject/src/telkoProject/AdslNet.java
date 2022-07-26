package telkoProject;

public class AdslNet extends Product{
private double maxSpeed;

public AdslNet() {
	super();
}

public AdslNet(int id, String name, String brand, String serialNo,double maxSpeed) {
	super( id,  name,  brand,  serialNo);
	this.maxSpeed = maxSpeed;
}

public double getMaxSpeed() {
	return maxSpeed;
}

public void setMaxSpeed(double maxSpeed) {
	this.maxSpeed = maxSpeed;
}

}
