package week12;

class ThreadC implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 1000; i += 2) {
			System.out.println("Runnable ThreadC: " + i);
			try {
				Thread.sleep(2000); //2초 휴식, sleep 메소드는 static임
			} catch(InterruptedException e) {
				System.out.println("InterruptedException 발생");
			}
		}
	}

}
