package week4Task;

class Person {
	private String name;
	private int age;
	private String gender;
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	int getAge() {
		return age;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	String getGender() {
		return gender;
	}
	
	void setGender(String gender) {
		this.gender = gender;
	}
	
	Person() {
		name = "이화인";
		age = 20;
		gender = "여자";
	}
	
	Person(String name){
		this.name = name;
	}

	Person(String name, int age, String gender) {
		this(name);
		this.age = age;
		this.gender = gender;
	}
	

}
