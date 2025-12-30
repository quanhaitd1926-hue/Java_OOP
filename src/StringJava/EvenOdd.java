package StringJava;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String[] arr = s.split("\\s+");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.print(arr[i] + " ");
			} else {
				for (int j = arr[i].length() - 1; j >= 0; j--) {
					System.out.print(arr[i].charAt(j));
				}
				System.out.print(" ");
			}
		}
	}
}
