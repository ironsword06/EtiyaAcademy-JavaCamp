package NamingConventions;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}class ProductManager { 
	//Class isimlerini PascalCase ile yazıyoruz.
	
	private int maxNumber; 
    //Değişken isimleri camelCase ile yazılır.
	
	public final String SECURITY_TOKEN = "..."; 
	//Final SCREAMING_SNAKE_CASE ile değişken ismlerini yazıyoruz.
	
	public ProductManager() { 
    //Constructor ismi PascalCase
	}

	public void getByCategoryId(int categoryId) { 
		//Method isimlerini camelCase ile yazıyoruz.
		List<Integer>numbers;
	}
}

 interface ProductRepository{
	 //Interface isimlerini PascalCase ile yazıyoruz.
 }

