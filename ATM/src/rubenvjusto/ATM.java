package rubenvjusto;

public class ATM {
	private double balance;
	private double depositAmount;
	private double withdrawnAmount;
	
	// default constructor
	public ATM() {
		
	}
	// getter setter

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

	public double getWithdrawnAmount() {
		return withdrawnAmount;
	}

	public void setWithdrawnAmount(double withdrawnAmount) {
		this.withdrawnAmount = withdrawnAmount;
	}
	
}