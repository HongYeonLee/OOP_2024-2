package week13Vid;

class BankDeposit extends Thread{
	private BankAccount account;
	
	BankDeposit(BankAccount account, String name){
		super(name);
		this.account = account;
	}
	
	public void run() {
		while(true) {
			try {
				sleep(3000);
				account.deposit(800);
			}catch(InterruptedException e) {
				System.out.println("저금 스레드 인터럽트");
				return;
			}
		}
	}
}
