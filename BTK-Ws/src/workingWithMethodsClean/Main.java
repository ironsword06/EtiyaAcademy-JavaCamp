package workingWithMethodsClean;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager(); 
		//Değişken ismini class ismi ile aynı yazarız burada farklı isimlendirmeler de yapılabilinir.
		
        //customerManager.add(1,"ACD","dmrklc","78461");
        //customerManager.add(2,"ACD2","dmrklc","3243",23);

	    //cityId eklediğimiz için hata verecektir. teker teker eklememiz gerekeceğinden sürdürülebilir bir hareket ve kod değildir
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("acd");
		customer.setLastName("dk");
		customer.setIdentyNumber("5434224");
		
		Customer customer2 = new Customer();
		customer.setId(2);
		customer.setFirstName("acd2");
		customer.setLastName("dk2");
		customer.setIdentyNumber("415465");
		
		Customer customer3 = new Customer();
		customer.setId(3);
		customer.setFirstName("acd3");
		customer.setLastName("dk3");
		customer.setIdentyNumber("999999");
		
		//Eklediğmiz cityId kodumuza bir etkide bulunmadı 
		
		
		
		
		customerManager.refactoredAdd(customer);
		customerManager.refactoredAdd(customer2);
		customerManager.refactoredAdd(customer3);
		
		
	}

}

class CustomerManager{
	
	public void add(int id,String firstName,String lastName,String identyNumber,int cityId) {
		System.out.println("Customer Added!");
	}
	
	public void refactoredAdd(Customer customer) {
		System.out.println("Customer Added!!");
	}
}

class Customer {
	int id;
	int cityId; 
	String firstName;
	String lastName;
	String identyNumber;
	
	//Foreign key alta yazılır 

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getIdentyNumber() {
		return identyNumber;
	}
	public void setIdentyNumber(String identyNumber) {
		this.identyNumber = identyNumber;
	}
	

}