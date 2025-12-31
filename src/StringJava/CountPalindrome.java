package StringJava;

import java.util.Arrays;
import java.util.Scanner;

public class CountPalindrome {
	public static boolean Palindrome(String s) {
		int l = 0, r = s.length() - 1;
		while (l <= r) {
			if (s.charAt(l) != s.charAt(r))
				return false;
			++l;
			--r;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String[] arr = s.split("\\s+");
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (Palindrome(arr[i]))
				System.out.print(arr[i] + " ");
		}
	}
}
