package StringJava;

import java.util.Scanner;

public class CountCapitalization {
	public static boolean check(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isUpperCase(s.charAt(i)))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String[] arr = s.split("\\s+");
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (check(arr[i]))
				++cnt;
		}
		System.out.println(cnt);
	}
}
