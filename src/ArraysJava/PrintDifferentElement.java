package ArraysJava;

import java.util.Scanner;

public class PrintDifferentElement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		System.out.print(a[0] + " ");
		for (int i = 1; i < n; i++) {
			int check = 1;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					check = 0;
					break;
				}
			}
			if (check == 1) {
				System.out.print(a[i] + " ");
			}
		}
	}
}
