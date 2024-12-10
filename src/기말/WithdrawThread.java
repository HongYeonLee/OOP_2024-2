package 기말;

class WithdrawThread extends Thread{
	private BankAccount account;
	
	WithdrawThread(String name, BankAccount account){
		super(name);
		this.account = account;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				sleep(5000);
				account.withdraw(1500);
			}catch(InterruptedException e) {
				System.out.println("인출 스레드 인터럽트");
				return;
			}
			
		}
	}
	
}
