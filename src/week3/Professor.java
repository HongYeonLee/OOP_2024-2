package week3;

class Professor extends Researcher{
	String country;
	
	Professor(){
		super();
		country = "Korea";
		//System.out.println("Professor() 생성자 메소드 콜");
	}
	
	Professor(String country){
		super("프로그래밍");
		this.country = country;
		//System.out.println("Professor(String country) 생성자 메소드 콜");
	}
	
	void teach() {
		System.out.print(" 가르치기");
	}
}
