package in.cms.model;

public class Manager extends Employee {
	private double bonus;
	
	public Manager() {
		/* default constructor */
	}

	public Manager(String name, int age, double salary, double bonus) {
		super(name, age, salary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\tbonus=" + bonus;
	}
	
}
