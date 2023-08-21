package ua.hillel;



import java.util.HashMap;


public class ProductRepository {
	
	private HashMap<Integer, String>  products;
		
	public ProductRepository(HashMap<Integer, String> products) {
		
		this.products = products;
	}

	public String findById (Product prod ) {
		return this.products.get(prod.getId());
		
	}

	public HashMap<Integer, String> getAllProducts(){
		return this.products;
	}
	
	

}
