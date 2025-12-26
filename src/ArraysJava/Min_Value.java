package ArraysJava;

import java.util.Scanner;

public class Min_Value {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		int min_value = 100001, cnt = 0;
		for (int i = 0; i < n; i++) {
			min_value = Math.min(min_value, a[i]);
		}
		for (int i = 0; i < n; i++) {
			if (a[i] == min_value)
				++cnt;
		}
		System.out.println(cnt);
	}
}
