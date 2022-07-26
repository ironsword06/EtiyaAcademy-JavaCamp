package telkoProject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//***************************INSTANCELARI OLUŞTURMAK***************************
				Service service1=new Service(1,"acd");
				List<Address>addresses = new ArrayList<Address>();
				Address address1 = new Address(1, "istanbul");
				Address address2 = new Address(2, "ankara");
				addresses.add(address2);
				addresses.add(address1);
				Plan plan = new Plan(1, "AugustPlan",100);//name düzeltilecek
				Plan plan1 = new JulyPlan(1, "JulyPlan", 150, 1000, 500, 100, 10);//namedüzeltilecek
				PaymentType paymentType1 = new BankCard(1, "dfgh", "134567");//name düzeltilecek
				Payment payment = new Payment(1, paymentType1, plan1, LocalDate.of(2022, 11, 24));
				Product product1= new AdslNet(1, "adsl", "Türktelekom", "34567", 20);
				FiberNet product2 = new FiberNet(2, "fiber", "Türktelekom", "2345678", true);
				Customer customer1 = new Customer(1,"132",addresses);
				IndividualCustomer individualCustomer1 = new IndividualCustomer(1,"13542",addresses,"1323131","ac","d");
				CorporateCustomer corporateCustomer1 = new CorporateCustomer(1,"132",addresses,"mert","1232");
				Subscription subscription1= new Subscription(1,LocalDate.of(2022, 12, 3),service1,individualCustomer1);
				Invoice invoice1 = new Invoice(1, LocalDate.of(2022, 11, 5),LocalDate.of(2022, 10, 3),subscription1,"1231414");
				
				//***************************NESNE ÖZELLİKLERİNİ ÇAĞIRMAK***************************
				
				System.out.println("Müşteri Numarası: " +customer1.getCustomerNumber());
				System.out.println("Abone Servisi Adı: "+subscription1.getService().getName());
				System.out.println("Bireysel Müşteri Adı: " +individualCustomer1.getFirstName());
				System.out.println("Abone Adı: " +subscription1.getCustomer().getCustomerNumber());
				System.out.println("Tarife Fiyatı: "+plan.getPrice());
				System.out.println("İndirimli Tarife Fiyatı: " +plan1.getPrice());
				System.out.println("Ödeme Şekli: " +payment.getPaymentType().getName());
				System.out.println("Ürün Markası: " +product1.getBrand());
				System.out.println("*************ALTYAPI KONTROLÜ*************");
				if(product2.isInfrastructure()) {
					System.out.println("Altyapi mevcut ");
				
				}
				else {
					System.out.println("Altyapi mevcut degil");
				}
				System.out.println("Fatura Numarası: " +invoice1.getInvoinceNumber());
				
				

	}

}
