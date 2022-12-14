package in.cms.ui;

import in.cms.model.Product;

public class ProductApp {

	public static void main(String[] args) {
		Product.setTax(10);
		
		Product[] products = new Product[5];		// array of objects
		products[0] = new Product(101, "mouse", 350.0);
		products[1] = new Product(102, "key board", 600.0);
		products[2] = new Product(103, "web cam", 1200.0);
		products[3] = new Product(104, "printer", 2500.0);
		products[4] = new Product(105, "speakers", 2000.0);
		
		for(int index = 0; index < 5; index++) {
			// System.out.println(products[index].getId() + "\t" + products[index].getName() + "\t\t\t" + products[index].getUnitRate() + "\t\t" + Product.getTax());
			System.out.printf("%-6d%-30s%7.2f%5d\n", products[index].getId(), products[index].getName(), products[index].getUnitRate(), Product.getTax());
		}
		
		

	}

}
