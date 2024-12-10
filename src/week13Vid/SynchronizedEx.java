package week13Vid;

public class SynchronizedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedBoard board = new SharedBoard();
		
		StudentThread th1 = new StudentThread("이화인", board);
		StudentThread th2 = new StudentThread("김이화", board);
		
		th1.start();
		th2.start();
	}

}
