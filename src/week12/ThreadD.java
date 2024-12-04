package week12;

class ThreadD implements Runnable{
	public void run() {
		for (int i = 1; i < 1000; i += 2) {
			System.out.println("Runnable ThreadD: " + "이화여대");
			try {
				Thread.sleep(1500); //1.5초 휴식
			} catch(InterruptedException e) {
				System.out.println("InterruptedException 발생");
			}
		}
	}
}
