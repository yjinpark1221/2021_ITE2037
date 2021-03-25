package selfTest;

public class Employee {

	/* Write the code */
	
	private String name;
	private int age;
	private String position;
	private int salary;
	private int vacationDays;
	
	public Employee() {}
	
	public Employee(String name, int age) {
		/* Write the code */
		
		this.name = name;
		this.age = age;
		this.position = "Engineer";	// default
		this.salary = 15000;		// default
		this.vacationDays = 20;		// default
	}
	
	public Employee(String name, int age, String position, int salary) {
		/* Write the code */
		
		this.name = name;
		this.age = age;
		this.position = position;
		this.salary = salary;
		this.vacationDays = 20;		// default
	}
	
	public Employee(String name, int age, String position, int salary, int vacationDays) {
		/* Write the code */
		
		this.name = name;
		this.age = age;
		this.position = position;
		this.salary = salary;
		this.vacationDays = vacationDays;
	}
	
	public void setSalary(int salary) {
		/* Write the code */
		
		this.salary = salary;
	}
	
	public void outInfo() {
		/* Write the code */
		
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("position : " + position);
		System.out.println("salary : " + salary);
		System.out.println("vacationDays : " + vacationDays);
		System.out.println();
	}
	
	public String vacation(int vacationDays) {
		/* Write the code */
		
		if (this.vacationDays >= vacationDays) {
			this.vacationDays -= vacationDays;
			return "Possible";
		}
		else return "Impossible";
	}
	
	public boolean equals(Employee anotherEmployee) {
		/* Write the code */
		
		return this.name.equals(anotherEmployee.name) && this.age == anotherEmployee.age && this.position.equals(anotherEmployee.position);
	}
}
