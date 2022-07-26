package telkoProject;

public class WorkAddress extends Address{
	private String officeNumber;

	public WorkAddress() {
		super();
	}

	public WorkAddress(int id, String description,String officeNumber) {
		super( id, description);
		this.officeNumber = officeNumber;
	}

	public String getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}
	
}

