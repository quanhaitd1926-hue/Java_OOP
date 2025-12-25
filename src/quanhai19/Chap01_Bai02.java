package quanhai19;

import java.util.Scanner;

public class Chap01_Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Length is: ");
		int length = scanner.nextInt();
		System.out.println("Width is: ");
		int width = scanner.nextInt();
		System.out.println("Chu vi hcn: " + (length + width) * 2);
		System.out.println("Dien tich hcn: " + length * width);
		scanner.close();
	}
}
