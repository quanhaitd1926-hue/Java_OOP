package StringJava;

import java.util.Scanner;

public class TiAnd28Tech {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String[] arr = s.split("\\s+");
		String t = "28tech";
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (t.equals(arr[i].toLowerCase()))
				++cnt;
		}
		System.out.println(cnt);
	}
}
