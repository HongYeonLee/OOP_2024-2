package week13Vid;

class SharedBoard {
	private int sum = 0;
	
	//동기화, 스레드가 한번에 하나씩만 이용 가능
	synchronized public void add() {
		System.out.println(Thread.currentThread().getName() + "add() 메소드 실행 중입니다.");
		int n = sum;
		Thread.yield(); //현재 실행 중인 스레드 양보 RUNNABLE -> RUNNABLE로 다시 스케줄링, yield()는 sleep처럼 Thread 클래스의 static 메소드
		n += 10; //10 증가
		sum = n; //증가한 값을 집계합에 기록
		System.out.println(Thread.currentThread().getName() + " : " + sum);
		System.out.println(Thread.currentThread().getName() + "add() 메소드 완료 중입니다.");
	}
	
	public int getSum() {
		return sum;
	}
}
