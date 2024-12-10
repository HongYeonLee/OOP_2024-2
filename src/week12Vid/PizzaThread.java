package week12Vid;

class PizzaThread extends Thread{
	private Pizza mypizza;
	
	PizzaThread(){
		System.out.println("PizzaThread 생성자 메소드");
		mypizza = new Pizza("고르곤졸라", 500, "치즈 토마토");
	}
	
	//스레드가 하는 일, 오버라이딩
	public void run() {
		while(true) {
			System.out.print("PizzaThread 2초 간격: ");
			System.out.println(mypizza.getPizzaInfo());
			try {
				sleep(2000); //Thread 클래스의 static 메소드 sleep(), throws InterruptedException 함
			}catch(InterruptedException e) {//lang에 있음
				System.out.println("InterruptedException 발생");
			}
		}
		
	}
}
