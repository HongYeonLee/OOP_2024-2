package week13Vid;

class BankWithdraw extends Thread{
	private BankAccount account;
	
	BankWithdraw(BankAccount account, String name){
		super(name);
		this.account = account;
	}
	
	public void run() {
		while(true) {
			try {
				sleep(1000);
				account.withdraw(1500);
			}catch(InterruptedException e) {
				System.out.println("인출 스레드 인터럽트");
				return;
			}
		}
	}
}
