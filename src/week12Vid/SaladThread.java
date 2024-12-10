package week12Vid;

class SaladThread extends Thread{
	private Salad mysalad;
	
	SaladThread(){
		System.out.println("SaladThread 생성자 메소드");
		mysalad = new Salad("그린 샐러드", 500, "토마토 갈리 드레싱");
	}
	
	//스레드가 하는 일, 오버라이딩
	public void run() {
		while(true) {
			System.out.print("SaladThread 2초 간격: ");
			mysalad.prepare();
			try {
				sleep(3000); //Thread 클래스의 static 메소드 sleep(), throws InterruptedException 함
			}catch(InterruptedException e) {//lang에 있음
				System.out.println("InterruptedException 발생");
			}
		}
		
	}
}
