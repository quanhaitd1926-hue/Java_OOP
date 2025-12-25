package Buoi01;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.printf("%.2f\n", Math.sqrt(n));
		System.out.printf("%.3f\n", Math.cbrt(n));
	}
}
