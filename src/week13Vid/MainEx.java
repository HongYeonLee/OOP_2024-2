package week13Vid;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//스레드 생성
		ThreadA a = new ThreadA("스레드 a");
		ThreadA b = new ThreadA("스레드 b");
		
		//스레드 생성
		a.start();
		b.start();
		
		a.interrupt(); //강제종료, 메인스레드가 a스레드를 interrupt()으로 강제 종료
		b.finish(); //강제종료, 메인스레드가 b스레드를 finish()로 종료
	}

}
