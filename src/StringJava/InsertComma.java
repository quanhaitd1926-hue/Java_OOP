package StringJava;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertComma {
	public static void insert(String s) {
		int cnt = 0;
		ArrayList<Character> arr = new ArrayList<>();
		for (int i = s.length() - 1; i >= 0; i--) {
			++cnt;
			arr.add(s.charAt(i));
			if (cnt % 3 == 0 && i != 0)
				arr.add(',');
		}
		for (int i = arr.size() - 1; i >= 0; i--) {
			System.out.print(arr.get(i));
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		insert(s);
	}
}
