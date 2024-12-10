package week13Vid;

class BankAccount {
	private int balance = 0;
	
	//동기화, 한번에 한개의 스레드만 해당 메소드를 이용할 수 있게함
	public synchronized void deposit(int amount) {
		balance += amount;
		System.out.print("1) 저금: " + amount);
		System.out.println(" 현재 잔액: " + balance);
		notifyAll();
		System.out.println("notifyAll()로 wait()를 깨운다");
	}
	
	public synchronized void withdraw(int amount) {
		while(balance < amount) {
			System.out.println("잔액이 부족해서 wait() 상태: " + amount);
			try {
				wait(); //block, WAITING 상태
			}catch(InterruptedException e) {
				Thread.currentThread().interrupt();
				System.out.println("스레드 인터럽트");
			}
		}
		balance -= amount;
		System.out.print("2) 인출 : " + amount);
		System.out.println("현재 잔액 : " + balance);
	}
}
