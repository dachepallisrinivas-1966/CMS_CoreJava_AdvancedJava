package in.cms.model;

public class ComplexNumber {
	/* data members or properties or fields */
	private int realPart;
	private int imaginaryPart;
	
	/* default (no-argument / no-parameter) constructor */
	public ComplexNumber() {
		/* default constructor */
	}
	
	/* parameter constructor */
	public ComplexNumber(int realPart, int imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	
	public void setRealPart(int realPart) {
		this.realPart = realPart;
	}
	
	public int getRealPart() {
		return this.realPart;
	}
	
	public void setImaginaryPart(int imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}
	
	public int getImaginaryPart() {
		return this.imaginaryPart;
	}
	
	@Override
	public String toString() {
		String result = "";						
		
		result += realPart;
		if (imaginaryPart > 0)							
			result += "+";
		else 
			result += "-";
		result += Math.abs(imaginaryPart);
		result += "i";
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		ComplexNumber first = this;
		ComplexNumber second = (ComplexNumber)obj;			
		return (first.realPart == second.realPart && first.imaginaryPart == second.imaginaryPart) ? true : false;
	}

}
