package quanhai19;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		double[] score = new double[10];
		for (int i = 0; i < 3; i++) {
			System.out.printf("Nhap ten hoc sinh %d: ", i + 1);
			name[i] = sc.nextLine();
			System.out.print("Nhap diem: ");
			score[i] = sc.nextDouble();
			sc.nextLine();
		}
		System.out.println("Danh sach hoc sinh:");
		for (int i = 0; i < 3; i++) {
			System.out.print(name[i] + "-" + score[i]);
			System.out.println();
		}
	}
}
