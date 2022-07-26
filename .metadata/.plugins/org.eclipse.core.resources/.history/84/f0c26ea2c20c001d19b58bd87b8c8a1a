package telkoProject;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Service service1=new Service(1,"acd");
		Customer customer1 = new Customer(1,"132");
		IndividualCustomer individualCustomer1 = new IndividualCustomer(1,"13542","1323131","ac","d");
		CorporateCustomer corporateCustomer1 = new CorporateCustomer(1,"132","mert","1232");
		Subscription subscription1= new Subscription(1,LocalDate.of(2022, 12, 3),service1,individualCustomer1);
		Invoice invoice1 = new Invoice(1, LocalDate.of(2022, 11, 5),LocalDate.of(2022, 10, 3),subscription1);
		System.out.println(customer1.getCustomerNumber());
		System.out.println(subscription1.getService().getName());
		System.out.println(individualCustomer1.getFirstName());
		System.out.println(subscription1.getCustomer().getCustomerNumber());
		
		

	}

}
