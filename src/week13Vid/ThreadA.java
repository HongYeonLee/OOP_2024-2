package week13Vid;

class ThreadA extends Thread{
	private String name;
	private boolean flag;
	
	ThreadA(String name){
		this.name = name;
		flag = false;
	}
	
	void finish() {
		flag = true;
	}
	
	//스레드가 하는 일
	public void run() { //run은 인터페이스의 추상 메서드를 오버라이딩한거니 꼭 public
		while(true) {
			System.out.println(name);
			try {
				sleep(1000);
				if(flag == true) {
					System.out.println("finish() call한 메인 스레드로 돌아갑니다.");
					return;
				}
			}catch(InterruptedException e) {
				System.out.println("인터럽트로 메인 스레드로 돌아갑니다.");
				return;
			}
		}
	}
}
