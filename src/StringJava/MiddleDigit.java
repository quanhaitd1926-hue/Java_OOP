package StringJava;

import java.util.Scanner;

public class MiddleDigit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		if (s.length() % 2 == 0) {
			System.out.println("NOT FOUND");
		} else
			System.out.println(s.charAt(s.length() / 2));
	}
}
