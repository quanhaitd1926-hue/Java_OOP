package TryCatch;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("username: ");
			String username = sc.nextLine();
			System.out.print("password: ");
			String password = sc.nextLine();
			System.out.print("So du: ");
			double balance = sc.nextDouble();
			System.out.print("can rut: ");
			double amount = sc.nextDouble();

			BankAccount acc = new BankAccount(username, password, balance);
			acc.withdraw(amount);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("end game");
		}
	}
}
