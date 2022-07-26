package telkoProject;

public class FiberNet extends Product{
private boolean infrastructure;

public FiberNet() {
	super();
}

public FiberNet(int id, String name, String brand, String serialNo,boolean infrastructure) {
	super( id,  name,  brand,  serialNo);
	this.infrastructure = infrastructure;
}

public boolean isInfrastructure() {
	return infrastructure;
}

public void setInfrastructure(boolean infrastructure) {
	this.infrastructure = infrastructure;
}

}
