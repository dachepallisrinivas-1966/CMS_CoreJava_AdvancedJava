package in.cms.model;

public class Product {
	private int id;
	private String name;
	private double unitRate;
	
	private static int tax;		// static data member
	
	
	public Product() {
		/* default constructor */
	}
	
	public Product(int id, String name, double unitRate) {
		this.id = id;
		this.name = name;
		this.unitRate = unitRate;
	}
	
	public static void setTax(int t) {		// static method
		tax = t;
	}
	
	public static int getTax() {			// static method
		return tax;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setUnitRate(double unitRate) {
		this.unitRate = unitRate;
	}
	
	public double getUnitRate() {
		return this.unitRate;
	}
}

