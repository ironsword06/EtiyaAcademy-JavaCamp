package oop1;

public class Main {
	public static void main(String[] args) {
		Category category1 = new Category();
category1.setId(1);
category1.setName("meyve");

Product product1 = new Product();
product1.setId(1);
product1.setName("elma");
product1.setUnitPrice(45);
product1.setCategory(category1);



System.out.println(product1.getId());
System.out.println(product1.getDiscountedPrice());

ProductService productService = new ProductService();
productService.add(product1);

	}
	
	
	
}




