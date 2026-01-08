package quanhai19;

public class BankAccount {
	private String id, customerID, acNumber, pinCode;
	private int acBalance;

	public BankAccount() {

	}

	public BankAccount(String id, String customerID, String acNumber, String pinCode, int acBalance) {
		super();
		this.id = id;
		this.customerID = customerID;
		this.acNumber = acNumber;
		this.pinCode = pinCode;
		this.acBalance = acBalance;
	}

	public void deposit(int money) {
		this.acBalance += money;
	}

	public void withdraw(int money) {
		if (this.acBalance - 50000 >= money) {
			this.acBalance -= money;
		}
	}

}
