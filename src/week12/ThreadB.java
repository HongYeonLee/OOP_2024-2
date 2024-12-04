package week12;

class ThreadB extends Thread{
	//생성자 메소드
	ThreadB(){
		
	}
	
	//스레드가 하는 일 - 1부터 1000까지 홀수만 2초 간격으로 출력하기
	public void run() {
		for (int i = 1; i < 1000; i += 2) {
			System.out.println("ThreadB: " + "이화여대");
			try {
				sleep(1500); //1.5초 휴식
			} catch(InterruptedException e) {
				System.out.println("InterruptedException 발생");
			}
		}
	}
}
