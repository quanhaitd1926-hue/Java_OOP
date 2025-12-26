package ArraysJava;

import java.util.Scanner;

public class PrimeAverage {
	public static boolean nt(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		int cnt = 0, sum = 0;
		for (int i = 0; i < n; i++) {
			if (nt(a[i])) {
				sum += a[i];
				cnt++;
			}
		}
		if (cnt != 0)
			System.out.printf("%.3f", (double) sum / cnt);
	}
}
