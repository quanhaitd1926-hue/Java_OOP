package Buoi01;

import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		int t = 3;
		while(t != 0) {
			n /= 10;
			--t;
		}
		System.out.println(n);
	}
}
