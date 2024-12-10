package 기말;

class DepositThread extends Thread{
	private BankAccount account;
	
	DepositThread(String name, BankAccount account){
		super(name);
		this.account = account;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
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
