package week3;

class Researcher extends Person{
	String subjectArea;
	
	Researcher(){
		super();
		subjectArea = "컴퓨터";
		//System.out.println("Researcher() 생성자 메소드 콜");
	}
	
	Researcher(String subjectArea){
		super("스마트워먼");
		this.subjectArea = subjectArea;
		//System.out.println("Researcher(String subjectArea) 생성자 메소드 콜");
	}
	
	void reseach(){
		System.out.print(" 연구하기");
	}

}
