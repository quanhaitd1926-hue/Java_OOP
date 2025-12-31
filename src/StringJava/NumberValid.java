package StringJava;

import java.util.Scanner;

public class NumberValid {
	public static boolean FirstLast(String s) {
		int l = 0, r = s.length() - 1;
		int Left = s.charAt(l) - '0';
		int Right = s.charAt(r) - '0';
		if ((Left % 2 != 0 && Right % 2 != 0) || (Left % 2 == 0 && Right % 2 == 0))
			return true;
		return false;
	}

	public static boolean check(String s) {
		for (int i = 0; i < s.length() - 1; i++) {
			if (Math.abs(s.charAt(i + 1) - s.charAt(i)) == 3)
				return false;
			if (s.charAt(i) == '2' && s.charAt(i + 1) == '8')
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < t; i++) {
			String s = scanner.nextLine();
			if (FirstLast(s) && check(s))
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}
}
