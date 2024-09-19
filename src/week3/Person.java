package week3;

//접근 지정자는 전부 디폴트로, 자바프로그램만 public
class Person {
	String name;
	
	//생성자 메소드, 필드 초기화용
	Person(){
		name = "이화인";
		//System.out.println("Person() 생성자 메소드 콜");
	}
	
	Person(String name){
		this.name = name;
		//System.out.println("Person(String name) 생성자 메소드 콜");
	}
	
	void speak() {
		System.out.print(" 말하기");
	}
	
	void eat(){
		System.out.print(" 먹기");
	}
	
	void walk() {
		System.out.print(" 걷기");
	}
	
	void sleep() {
		System.out.print(" 잠자기");
	}
}

