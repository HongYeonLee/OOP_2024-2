package week13Vid;

public class BankEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount();
		
		//저금 스레드
		BankDeposit d1 = new BankDeposit(account, "d1");
		BankDeposit d2 = new BankDeposit(account, "d2");
		
		//출금 스레드
		BankWithdraw w1 = new BankWithdraw(account, "w");
		BankWithdraw w2 = new BankWithdraw(account, "w");
		d1.start();
		d2.start();
		w1.start();
		w2.start();
	}

}
