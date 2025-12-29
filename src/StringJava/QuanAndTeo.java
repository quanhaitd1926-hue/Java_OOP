package StringJava;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanAndTeo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		ArrayList<Character> arr = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != '2' && c != '8' && c != 't' && c != 'e' && c != 'c' && c != 'h') {
				arr.add(c);
			}
		}
		if (arr.size() == 0) {
			System.out.println("EMPTY");
		} else {
			for (char x : arr)
				System.out.print(x);
		}
	}
}
