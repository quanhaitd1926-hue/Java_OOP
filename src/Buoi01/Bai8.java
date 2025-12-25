package Buoi01;

import java.util.Scanner;

public class Bai8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		long F = 5 * x + 2 * y + (long) x * y;
		System.out.println(F);
	}
}
