package ArraysJava;

import java.util.Scanner;

public class MarkArrays4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		int[] cnt = new int[10000001];
		int max_value = -1;
		for (int i = 0; i < n; i++) {
			cnt[a[i]]++;
			max_value = Math.max(max_value, a[i]);
		}
		int max_frequency = -1;
		for (int i = 0; i < n; i++) {
			if (cnt[a[i]] != 0) {
				max_frequency = Math.max(max_frequency, cnt[a[i]]);
			}
		}
		for (int i = 0; i <= max_value; i++) {
			if (cnt[i] != 0 && cnt[i] == max_frequency) {
				System.out.println(i + " " + cnt[i]);
				break;
			}
		}
	}
}
