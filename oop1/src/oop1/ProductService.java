package oop1;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
public void add(Product product) {
	System.out.println("Product Added! :" + product);
	
}
public void update(Product product) {
	System.out.println("Product Updatedé :"+ product);
	
}
private void delete(Product product) {
	System.out.println("Product Deletedé : "+ product);

}
public List<Product> getAll() {
	return new ArrayList<Product>();
	
}
}
