package in.cms.ui;

import in.cms.model.ComplexNumber;	

public class ComplexNumberApp {

	public static void main(String[] args) {
//		ComplexNumber c1 = new ComplexNumber();		// default constructor is executed

//		System.out.println(c1.getRealPart());
//		System.out.println(c1.getImaginaryPart());
//		
//		
//		System.out.println("----------------------------------------------");
//
//		ComplexNumber c2 = new ComplexNumber(-2,-3);		// parameter constructor is executed
//		System.out.println(c2.getRealPart());
//		System.out.println(c2.getImaginaryPart());
//		System.out.println("----------------------------------------------");
//
//		c2.setRealPart(20);
//		c2.setImaginaryPart(10);
//		System.out.println(c2.getRealPart());
//		System.out.println(c2.getImaginaryPart());
//		System.out.println("----------------------------------------------");
		
		ComplexNumber c1 = new ComplexNumber(-2,3);
		System.out.println(c1);
		//System.out.println(c1.toString());		// fully-qualified-class-name + "@" + hashcode-in-hexa-decimal-form
		
		ComplexNumber c2 = new ComplexNumber(-2,3);
		System.out.println(c2);
		
		System.out.println(c1 == c2);				// by default, it compare hashcodes
		System.out.println(c1.equals(c2));			// as per your logic, it compare, otherwise hashcodes are compared
	}

}
