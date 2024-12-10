package 기말;

public class BankEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount();
		WithdrawThread w = new WithdrawThread("인출", account);
		DepositThread d = new DepositThread("저금", account);
		
		w.start();
		d.start();
	
	}

}
