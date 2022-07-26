package telkoProject;

public class JulyPlan extends MobilePlan{
	private double discount;

	public JulyPlan() {
		super();
	}

	public JulyPlan(int id, String name, double price,double data, int sms, int min,double discount) {
		super( id,  name,  price, data,  sms,  min);
		this.discount = discount;
		this.setPrice(price* (1-discount/100));
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}


}
