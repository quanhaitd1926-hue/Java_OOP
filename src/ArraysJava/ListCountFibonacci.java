package ArraysJava;

import java.util.Scanner;

public class ListCountFibonacci {
	public static long[] fibo = new long[100];

	public static void init() {
		fibo[0] = 0;
		fibo[1] = 1;
		for (int i = 2; i <= 92; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
		}
	}

	public static boolean check(long n) {
		for (int i = 0; i <= 92; i++) {
			if (n == fibo[i])
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		init();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextLong();
		}
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (check(a[i])) {
				System.out.print(a[i] + " ");
				cnt++;
			}
		}
		if (cnt == 0)
			System.out.println("NONE");
	}
}
