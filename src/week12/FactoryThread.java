package week12;

class FactoryThread extends Thread{
	
	private String name;
	private int interval;
	private int count;
	
	FactoryThread (){
		
	}
	
	FactoryThread (String name, int interval, int count){
		this.name = name;
		this.interval = interval;
		this.count = count;
	}
	
	public void run() {
		for (int i = 1; i <= count; i++) {
			System.out.printf("%s: %d개 %.1f초 생산 중...\n", name, i, interval / 1000.0);
			try {
				sleep(interval);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(this.name + " ~~~ 생산 완료 ~~~ 스레드 종료합니다");
	}
}
