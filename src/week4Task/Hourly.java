package week4Task;

public class Hourly extends Employee{
	private int time;

	int getTime() {
		return time;
	}

	void setTime(int time) {
		this.time = time;
	}
	
	Hourly() {
		time = 1;
	}

	Hourly(int time) {
		this.time = time;
	}

	Hourly(String name, int age, String gender, int salary, String hireDate, int time) {
		super(name, age, gender, salary, hireDate);
		this.time = time;
	}
}
