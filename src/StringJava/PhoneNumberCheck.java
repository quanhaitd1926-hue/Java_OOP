package StringJava;

import java.util.Scanner;

public class PhoneNumberCheck {
	public static boolean check(String s) {
		if (s.charAt(0) != '0')
			return false;
		if (s.length() != 10 && s.length() != 11)
			return false;
		else {
			for (int i = 0; i < s.length(); i++) {
				if (!Character.isDigit(s.charAt(i)))
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < t; i++) {
			String s = scanner.nextLine();
			if (check(s))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
