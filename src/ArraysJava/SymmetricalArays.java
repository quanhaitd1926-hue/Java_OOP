package ArraysJava;

import java.util.Scanner;

public class SymmetricalArays {

	public static boolean check(int a[], int n) {
		int l = 0, r = n - 1;
		while (l <= r) {
			if (a[l] != a[r])
				return false;
			++l;
			--r;
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
		if (check(a, n))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
