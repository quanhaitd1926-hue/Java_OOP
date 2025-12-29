package StringJava;

import java.util.Arrays;
import java.util.Scanner;

public class SortDigit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		String sorted = new String(chars);
		int index = 0;
		while (index < sorted.length() - 1 && sorted.charAt(index) == '0') {
			++index;
		}
		for (int i = index; i < sorted.length(); i++) {
			System.out.print(sorted.charAt(i));
		}
	}
}
