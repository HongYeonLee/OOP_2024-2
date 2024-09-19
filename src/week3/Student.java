package week3;

class Student extends Person{
	String school;
	
	//생성자 메소드, 필드 초기화
	Student() {
		super();
		school = "이화여대";
		System.out.println("Student() 생성자 메소드 콜");
	}
	
	Student(String school) {
		//super(); - 슈퍼클래스 생성자 콜이 생략되어있음
		super("챗GPT");
		this.school = school;
		System.out.println("Student(String school) 생성자 메소드 콜");
	}
	
	void study() {
		System.out.print(" 공부하기");
	}


}
