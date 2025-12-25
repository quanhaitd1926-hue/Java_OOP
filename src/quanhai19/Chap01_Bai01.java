package quanhai19;

import java.util.Scanner;

public class Chap01_Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Your name is: ");
		String name = scanner.nextLine();
		System.out.println("Your grade is: ");
		int grade = scanner.nextInt();
		System.out.println(name + " co diem la: " + grade);
		scanner.close();
	}
}
