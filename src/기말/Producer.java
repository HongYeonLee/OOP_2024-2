package 기말;

class Producer implements Runnable{
	private final CarFactory factory;
	private final String partName;
	private final int produceCount;
	private final long interval;
	
	Producer(CarFactory factory, String partName, int produceCount, long interval){
		this.factory = factory;
		this.partName = partName;
		this.produceCount = produceCount;
		this.interval = interval;
	}
	
	public void run() {
		for (int i = 0; i < produceCount; i++) {
			try {
				Thread.sleep(interval);
				factory.produce(partName, 1);
			}catch(InterruptedException e) {
				System.out.println("인터럽트발생");
			}
		}
		System.out.println(partName + "생산 완료 후 스레드 종료");
	}
}
