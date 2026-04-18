package TryCatch;

public class BankAccount {
	private String username, password;
	private double balance;

	public BankAccount(String username, String password, double balance) {
		super();
		this.username = username;
		if (password.length() < 6)
			throw new WeakPasswordException("password < 6");
		this.password = password;
		this.balance = balance;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdraw(double amount) throws NegativeBalenceException {
		if (amount > this.balance)
			throw new NegativeBalenceException("error");
		double money = this.balance - amount;
		this.balance -= amount;
		System.out.println("Rut tien thanh cong. So du con lai: " + money);
	}

}
