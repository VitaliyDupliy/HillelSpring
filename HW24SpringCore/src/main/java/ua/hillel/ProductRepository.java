package ua.hillel;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class ProductRepository {
	
	private static List <Product> products = new ArrayList<>();

	



	public Product findById (int id ) {
		
		for(Product p : products) {
			if (p.getId() == id) {
				return p;
			}
		}
		
		return null;
	}

	
	public List <Product> getAllProduct () {
		return products;
	}


	public List<Product> getProducts() {
		return products;
	}
	
	
	

}
