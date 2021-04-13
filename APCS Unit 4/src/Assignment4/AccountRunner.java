package Assignment4;

public class AccountRunner {

	public static void main(String[] args) {
		
		Account acct1 = new Account("John Brown", 54328, 1000.00);
		
		acct1.makeDeposit(210.50);
		System.out.println("Balance is:  $" + acct1.getBalance());
		
		acct1.makeDeposit(180.50);
		System.out.println("Balance is:  $" + acct1.getBalance());
		
		acct1.makeWithdrawal(200.00);
		System.out.println("Balance is:  $" + acct1.getBalance());
		
		acct1.makeWithdrawal(2000);
		System.out.println("Balance is:  $" + acct1.getBalance());
		
		System.out.println("");
		System.out.println(acct1.toString());

	}

}
