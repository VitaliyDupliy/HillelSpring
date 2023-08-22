package ua.hillel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Cart {
	
	
	private List<Product> choosenProd = new ArrayList<>();
	
	
	
	public void addProduct(Product product) {
		
			choosenProd.add(product);
		System.out.println("Product with id = " + product + " was edded to cart");
	}
	
	public void removeProd(int id) {
		
		choosenProd.removeIf(prod -> prod.getId() == id);
		System.out.println("Product with id = " + id + " was removed from cart");
	}

	public List<Product> getChoosenProd() {
		return choosenProd;
	}
	
	
	
}
