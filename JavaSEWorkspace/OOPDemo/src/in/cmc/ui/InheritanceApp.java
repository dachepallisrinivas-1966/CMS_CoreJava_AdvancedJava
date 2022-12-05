package in.cmc.ui;

import in.cmc.model.Employee;
import in.cmc.model.Manager;
import in.cmc.model.Person;
import in.cmc.model.Student;

public class InheritanceApp {

	public static void main(String[] args) {
		// Person person = new Person("divya", 34);
		// System.out.println(person.getName() + "\t" + person.getAge());
		
		Employee employee = new Employee("srinivas", 56, 45000.0);
		System.out.println(employee.getName() + "\t" + employee.getAge() + "\t" + employee.getSalary());
		
		Student student = new Student("vidya", 21, 75000.0);
		System.out.println(student.getName() + "\t" + student.getAge() + "\t" + student.getFee());
		
		Manager manager = new Manager("kumar", 45, 60000.0, 12000.0);
		System.out.println(manager.getName() + "\t" + manager.getAge() + "\t" + manager.getSalary() + "\t" + manager.getBonus());
		

	}

}
