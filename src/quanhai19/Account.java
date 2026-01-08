package quanhai19;

public class Account {
	private String id, customerID, username, password;

	public Account() {

	}

	public Account(String id, String customerID, String username, String password) {
		super();
		this.id = id;
		this.customerID = customerID;
		this.username = username;
		this.password = password;
	}

	public boolean checkLogin(String username, String password) {
		if (this.password.equals(password) && this.username.equals(username))
			return true;
		else
			return false;
	}

}
