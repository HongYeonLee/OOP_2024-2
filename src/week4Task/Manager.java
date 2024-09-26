package week4Task;

class Manager extends Employee{
	private int count;

	int getCount() {
		return count;
	}

	void setCount(int count) {
		this.count = count;
	}
	
	Manager() {
		count = 1;
	}

	Manager(int count) {
		this.count = count;
	}

	Manager(String name, int age, String gender, int salary, String hireDate, int count) {
		super(name, age, gender, salary, hireDate);
		this.count = count;
	}
	
}
