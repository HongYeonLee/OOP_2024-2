package week4Task;

class Employee extends Person{
	private int salary;
	private String hireDate;
	
	int getSalary() {
		return salary;
	}
	
	void setSalary(int salary) {
		this.salary = salary;
	}
	
	String getHireDate() {
		return hireDate;
	}
	
	void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	Employee() {
		salary = 200;
		hireDate = "1월1일";
	}

	Employee(int salary, String hireDate) {
		this.salary = salary;
		this.hireDate = hireDate;
	}

	Employee(String name, int age, String gender, int salary, String hireDate) {
		super(name, age, gender);
		this.salary = salary;
		this.hireDate = hireDate;
	}
	
}
