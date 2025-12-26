package ArraysJava;

import java.util.Scanner;

public class PrintRElement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0 && a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
				++cnt;
			}
		}
		if (cnt == 0)
			System.out.println("NONE");
	}
}
