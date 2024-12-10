package week13Vid;

class StudentThread extends Thread{
	private SharedBoard board;
	
	public StudentThread(String name, SharedBoard board) {
		super(name);
		this.board = board;
	}
	
	//스레드가 하는 일
	public void run() {
		for (int i = 0; i < 10; i++) {
			board.add();
			try {
				sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
