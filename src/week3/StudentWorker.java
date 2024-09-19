package week3;

class StudentWorker extends Student{
	String jobRole;
	
	StudentWorker(){
		//super()가 생략되어있다
		super(); //this() 메소드와 동일하게 생성자 메소드의 첫번째 줄에 나와야한다
		jobRole = "티칭조교";
		System.out.println("StudentWorker() 생성자 메소드 콜");
	}
	
	StudentWorker(String jobRole){
		super("서울대학교");
		this.jobRole = jobRole;
		System.out.println("StudentWorker(String jobRole) 생성자 메소드 콜");
	}
	
	void work() {
		System.out.print(" 일하기");
	}
}
