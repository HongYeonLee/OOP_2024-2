package week14Task;

class Consumer implements Runnable{
	private final CarFactory factory;
	private final int carCount;
	private final long interval;

	public Consumer(CarFactory factory, int carCount, long interval) {
		this.factory = factory;
		this.carCount = carCount;
		this.interval = interval;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				Thread.sleep(interval);
				factory.sellCar();
			} catch(InterruptedException e) {
				System.out.println("자동차 생산 스레드가 중단되었습니다.");
			}
		}
	}
}
