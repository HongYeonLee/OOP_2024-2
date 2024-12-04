package week12;

//Thread 클래스 사용해서 스레드 만들기
class ThreadA extends Thread{
	
	//생성자 메소드
	ThreadA(){
		
	}
	
	//스레드가 하는 일 - 1부터 1000까지 홀수만 2초 간격으로 출력하기
	public void run() {
		for (int i = 1; i < 1000; i += 2) {
			System.out.println("ThreadA: " + i);
			try {
				sleep(2000); //2초 휴식
			} catch(InterruptedException e) {
				System.out.println("InterruptedException 발생");
			}
		}
	}
}
