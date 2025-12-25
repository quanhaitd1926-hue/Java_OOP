package Buoi01;

import java.util.Scanner;

public class Bai7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(n * 2);
		System.out.printf("\n");
		System.out.println((long) n * 10);
		System.out.printf("\n");
		System.out.println(n / 2);
		System.out.printf("\n");
		System.out.printf("%.3f\n", (double) n / 2);
	}
}
