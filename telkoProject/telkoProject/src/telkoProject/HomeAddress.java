package telkoProject;

public class HomeAddress extends Address{
	private String buildingNumber;

	public HomeAddress() {
		super();
	}

	public HomeAddress(int id, String description,String buildingNumber) {
		super(id,description);
		this.buildingNumber = buildingNumber;
	}

	public String getBuildingNumber() {
		return buildingNumber;
	}

	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}
}
