package Buoi01;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		int t = scanner.nextInt();
		System.out.println(y + "," + z + "," + x + "," + t);
		System.out.println((long) x + y + z + t);
		System.out.println(x - y + (long) z * t);
	}
}
