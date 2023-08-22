package ua.hillel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
		
		Product product1 = new Product(1, "product1", 1.1);
		Product product2 = new Product(2, "product2", 2.1);
		Product product3 = new Product(3, "product3", 3.1);
		
		ApplicationContext context = new AnnotationConfigApplicationContext("ua.hillel");
		
		ProductRepository prodRep =  (ProductRepository) context.getBean("productRepository");
		
			
		prodRep.getProducts().add(product1);
		prodRep.getProducts().add(product2);
		prodRep.getProducts().add(product3);
		
		System.out.println(prodRep.getProducts());
		
		Cart cart = (Cart) context.getBean("cart");
		cart.addProduct(product1);
		cart.addProduct(product2);
		cart.addProduct(product3);
		
		System.out.println(cart.getChoosenProd());
		
		cart.removeProd(2);

		System.out.println(cart.getChoosenProd());
		
		((AbstractApplicationContext) context).close();
	}

}
