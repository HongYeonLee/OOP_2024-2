package week12Vid;

public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaThread p = new PizzaThread();
		SaladThread s = new SaladThread();
		
		//스레드 실행
		p.start();
		s.start();
	}

}
