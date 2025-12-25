package Buoi01;

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		System.out.println((int) Math.floor(x));
		System.out.println((int) Math.ceil(x));
		System.out.println((int) Math.round(x));
	}
}
