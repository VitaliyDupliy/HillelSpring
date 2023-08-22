package ua.hillel;

public class Product {

	private int id;
	private String name;
	private double prise;
	
			
	public Product(int id, String name, double prise) {
		this.id = id;
		this.name = name;
		this.prise = prise;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrise() {
		return prise;
	}
	public void setPrise(double prise) {
		this.prise = prise;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", prise=" + prise + "]";
	}
	
	
}
