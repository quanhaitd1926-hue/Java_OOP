package StringJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortWordWithLength {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String[] arr = s.split("\\s+");
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() != o2.length()) {
					return o1.length() - o2.length();
				} else {
					return o1.compareTo(o2);
				}
			}

		});
		for (String x : arr)
			System.out.print(x + " ");
	}
}
