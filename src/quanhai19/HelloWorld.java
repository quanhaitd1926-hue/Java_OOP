package quanhai19;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Integer[] a = new Integer[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

	}
}
