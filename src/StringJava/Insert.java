package StringJava;

import java.util.Scanner;

public class Insert {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int k = scanner.nextInt();
		for (int i = 0; i < k; i++) {
			System.out.print(s.charAt(i));
		}
		System.out.print("28tech");
		for (int i = k; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}
	}
}
