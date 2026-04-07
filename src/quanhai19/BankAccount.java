package quanhai19;

public class BankAccount {
	private String number;
	private double balance;
	private String customerName, customerEmail, customerPhone;

	public BankAccount() {
		super();
	}

	public BankAccount(String number, double balance, String customerName, String customerEmail, String customerPhone) {
		super();
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;
	}

	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("Deposit of $" + depositAmount + "New balance is $" + this.balance);
	}

	public void withdraw(double withdrawAmount) {
		if (this.balance - withdrawAmount < 0) {
			System.out.println("Withdraw failed! You only have $" + this.balance + " in your account");
		} else {
			this.balance -= withdrawAmount;
			System.out.println("Withdrawl of $" + withdrawAmount + "Remaning balance = $" + this.balance);
		}
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

}
