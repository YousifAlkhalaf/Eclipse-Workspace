package Assignment4;

public class Account {

	String accountName;
	int accountID;
	double balance;
	
	public Account (String accountName, int accountID, double balance) {
		this.accountName = accountName;
		this.accountID = accountID;
		this.balance = balance;
	}
	
	public double getBalance () {
		return balance;
	}
	
	public int getID () {
		return accountID;
	}
	
	public String getAccountName () {
		return accountName;
	}
	
	public void makeDeposit(double amount) {
		balance += amount;
	}
	
	public void makeWithdrawal(double amount) {
		if (amount > this.balance) {
			System.out.println("WARNING! INSUFFICIENT FUNDS! WITHDRAWAL FAILED!");
		} else {
			this.balance -= amount;
		}
	}
	
	public String toString () {
		return String.format("Name: %s     Acct #: %d     Balance: $%.2f", this.accountName, this.accountID, this.balance);
	}
}
