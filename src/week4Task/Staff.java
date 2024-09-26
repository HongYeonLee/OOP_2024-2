package week4Task;

class Staff extends Employee{
	private String major;

	String getMajor() {
		return major;
	}

	void setMajor(String major) {
		this.major = major;
	}
	
	Staff() {
		major = "아메리카노";
	}

	Staff(String major) {
		this.major = major;
	}

	Staff(String name, int age, String gender, int salary, String hireDate, String major) {
		super(name, age, gender, salary, hireDate);
		this.major = major;
	}
	
}
