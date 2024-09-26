package week4;

class Person {
	//필드는 private
	private String name; //private는 클래스 내부에서만 접근 가능
	private String id;
	
	//get, set 메소드 만들기, 필드가 private일 때 사용
	String getName() {
		return name;
	}
	
	String getId() {
		return id;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setId(String id) {
		this.id = id;
	}
	
	//생성자 메소드
	Person(){ //기본 생성자는 반드시 만들기
		name = "이화인";
		id = "EWHA2024";
		System.out.println("Person() 생성자 메소드 콜");
	}
	
	Person(String name, String id){
		this.name= name;	
		this.id = id;
		System.out.println("Person(String name, String id) 생성자 메소드 콜");
	}
}
