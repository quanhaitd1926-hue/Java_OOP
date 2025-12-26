package ArraysJava;

import java.util.Scanner;

public class ChanLe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		int c = 0, l = 0, sumC = 0, sumL = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				++c;
				sumC += a[i];
			} else {
				++l;
				sumL += a[i];
			}
		}
		System.out.println(c);
		System.out.println(l);
		System.out.println(sumC);
		System.out.println(sumL);
	}
}
