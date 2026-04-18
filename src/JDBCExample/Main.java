package JDBCExample;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			for (int i = 1; i <= 3; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				System.out.println("x / y = " + x / y);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
