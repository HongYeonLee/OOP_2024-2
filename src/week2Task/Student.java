package week2Task;

public class Student {
	String school;
	String major;
	int ID;
	String name;
	int age;
	String email;
	
	public Student() {
		school = "이화여대";
		major = "컴퓨터공학과";
		ID = 2371049;
		name = "이홍연";
		age = 22;
		email = "llhongyan@ewha.ac.kr";
	}
	
	public Student(String school, String name) {
		this.school = school;
		this.name = name;
		major = "사이버보안";
		ID = 237100;
		age = 20;
		email = "ewha@ewha.ac.kr";
	}
	
	public Student(String major, String name, int ID, int age) {
		this.major = major;
		this.name = name;
		this.ID = ID;
		this.age = age;
		school = "이화여대";
		email = "email@ewha.ac.kr";
	}
	
	public Student(String school, String major, int ID, String name, int age, String email) {
		this.school = school;
		this.major = major;
		this.ID = ID;
		this.name = name;
		this.age = age;
		this.email = email;
	}

}
