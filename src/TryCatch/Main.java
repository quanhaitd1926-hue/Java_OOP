package TryCatch;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Nhap n = ");
			try {
				int n = scanner.nextInt();
				try {
					System.out.println("ans 10 / n = " + 10 / n);
					break;
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("run error");
				}
			} catch (Exception e) {
				// TODO: handle exception
				scanner.next();
				System.out.println("run error");
			}
		}
	}
}
