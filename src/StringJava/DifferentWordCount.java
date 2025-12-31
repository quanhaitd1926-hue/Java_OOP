package StringJava;

import java.util.HashSet;
import java.util.Scanner;

public class DifferentWordCount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String[] arr = s.split("\\s+");
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i].toLowerCase());
		}
		System.out.println(set.size());
	}
}
