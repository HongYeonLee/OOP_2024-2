package 기말;

class BankAccount {
	int balance;
	BankAccount(){
		balance = 0;
	}
	
	synchronized public void deposit(int amount) {
		balance += amount;
		System.out.print("1) 저금 : " + amount);
		System.out.println("현재 잔액: " + balance);
		notifyAll();
		System.out.println("notifyAll()");
	}
	
	synchronized public void withdraw(int amount) {
		while(balance < amount) {
			System.out.println("잔액이 부족해서 wait()상태");
			try {
				wait();
			}
			catch(InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		balance -= amount;
		System.out.print("1) 출금 : " + amount);
		System.out.println("현재 잔액: " + balance);
	}
}
