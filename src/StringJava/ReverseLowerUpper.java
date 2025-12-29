package StringJava;

import java.util.Scanner;

public class ReverseLowerUpper {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
	}
}
