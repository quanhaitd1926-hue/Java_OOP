package StringJava;

import java.util.Scanner;

public class ListWords {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String t = "";
		for (char x : s.toCharArray()) {
			if (x == '.' || x == ',' || x == '!' || x == '?') {
				t += " ";
			} else
				t += x;
		}
		String[] arr = t.split("\\s+");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length - 1)
				System.out.print(" ");
		}
	}
}
