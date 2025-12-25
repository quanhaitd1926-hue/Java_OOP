package Buoi01;

import java.util.Scanner;

public class Bai9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int width = scanner.nextInt();
		System.out.println("Chu vi HCN la : " + (length + width) * 2);
		System.out.println("Dien tich HCN la : " + (long) length * width);
	}
}
