package quanhai19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < t; i++) {
			String s = scanner.nextLine();
			Pattern pattern = Pattern.compile("0\\d{9,10}");
			Matcher matcher = pattern.matcher(s);
			if (matcher.matches())
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}
}
