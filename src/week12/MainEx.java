package week12;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//스레드 생성
		ThreadA ahn = new ThreadA();
		ThreadB ewha = new ThreadB();
		Thread c = new Thread(new ThreadC());
		Thread d = new Thread(new ThreadD());
		
		//스레드 실행
		ahn.start();
		ewha.start();
		c.start();
		d.start();
	}

}
