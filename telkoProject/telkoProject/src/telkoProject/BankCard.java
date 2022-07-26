package telkoProject;

public class BankCard extends PaymentType{
	private String cardNo;
	
	public BankCard() {
		super();
	}
	public BankCard(int id, String name,String cardNo) {
		super( id, name);
		this.cardNo = cardNo;
	}
	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	

	
}
