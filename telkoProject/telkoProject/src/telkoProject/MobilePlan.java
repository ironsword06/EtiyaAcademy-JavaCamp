package telkoProject;

public class MobilePlan extends Plan{
	private double data;
	private int sms;
	private int min;
	public MobilePlan() {
		super();
	}
	public MobilePlan(int id, String name, double price,double data, int sms, int min) {
		super(id,name, price);
		this.data = data;
		this.sms = sms;
		this.min = min;
	}
	public double getData() {
		return data;
	}
	public void setData(double data) {
		this.data = data;
	}
	public int getSms() {
		return sms;
	}
	public void setSms(int sms) {
		this.sms = sms;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
}
