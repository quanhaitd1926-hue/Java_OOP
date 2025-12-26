package ArraysJava;

import java.util.Scanner;

public class MarkArrays3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		int[] cnt = new int[10000001];
		for (int i = 0; i < n; i++) {
			cnt[a[i]]++;
		}
		for (int i = 0; i < n; i++) {
			if (cnt[a[i]] != 0) {
				System.out.println(a[i] + " " + cnt[a[i]]);
				cnt[a[i]] = 0;
			}
		}
	}
}
