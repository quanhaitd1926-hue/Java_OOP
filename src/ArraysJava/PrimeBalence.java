package ArraysJava;

import java.util.Scanner;

public class PrimeBalence {

	public static boolean prime(int n) {
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
		for (int i = 1; i < n - 1; i++) {
			int sumL = 0, sumR = 0;
			for (int j = 0; j < i; j++) {
				sumL += a[j];
			}
			for (int j = i + 1; j < n; j++) {
				sumR += a[j];
			}
			if (prime(sumL) && prime(sumR)) {
				System.out.print(i + " ");
			}
		}
	}
}
