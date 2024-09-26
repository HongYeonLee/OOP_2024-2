package week4;

class Student extends Person{
	//필드 학과, 학년, private
	private String grade;
	private String department;
	
	//필드가 private일 때는 get, set 메소드를 만들기
	String getGrade() {
		return grade;
	}
	
	String getDepartment() {
		return department;
	}
	
	void setGrade(String grade) {
		this.grade = grade;
	}
	
	void setDepartment(String department) {
		this.department = department;
	}
	
	//생성자 메소드, 필드 초기화
	Student(){
		//super(); 가 생략되있다
		grade = "A";
		department = "컴퓨터학과";
		System.out.println("Student() 생성자 메소드 콜");
	}

	Student(String grade, String department) {
		//super(); 가 생략되있다
		this.grade = grade;
		this.department = department;
		System.out.println("Student(String grade, String department) 생성자 메소드 콜");
	}
	
	
}
