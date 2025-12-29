package StringJava;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintDigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		ArrayList<Character> arr = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				System.out.print(s.charAt(i));
			} else {
				arr.add(s.charAt(i));
			}
		}
		System.out.println();
		for (char x : arr)
			System.out.print(x);
	}
}
