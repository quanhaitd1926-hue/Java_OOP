package StringJava;

import java.util.Scanner;

public class SumDigit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				sum += s.charAt(i) - '0';
			}
		}
		System.out.println(sum);
	}
}
