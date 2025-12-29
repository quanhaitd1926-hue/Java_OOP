package StringJava;

import java.util.Scanner;

public class BeautifulDigit {
	public static boolean check(String s) {
		for (int i = 1; i < s.length(); i++) {
			if (Math.abs(s.charAt(i) - s.charAt(i - 1)) != 1)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		if (s.length() < 2)
			System.out.println("NO");
		else {
			if (check(s))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
