package telkoProject;

public class CreditCard extends PaymentType {
private String cardNo;

public CreditCard() {
	super();
}

public CreditCard(int id, String name,String cardNo) {
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
