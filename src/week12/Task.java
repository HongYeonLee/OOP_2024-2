package week12;

class Task implements Runnable{
	private int taskId;
	private int interval;
	
	Task(){
		
	}
	
	Task(int taskId, int interval){
		this.taskId = taskId;
		this.interval = interval;
	}
	
	public void run() {
		System.out.println("스레드 " + this.taskId + " 작업시작");
		try {
			Thread.sleep(interval);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("스레드 " + this.taskId + " 작업종료");
	}
}
