package OOP;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma sinh vien: ");
		String id = sc.nextLine();
		System.out.print("Nhap chuyen nganh: ");
		String major = sc.nextLine();
		System.out.print("Nhap ten: ");
		String name = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		String address = sc.nextLine();
		System.out.print("Nhap tuoi: ");
		int age = sc.nextInt();
		Student st = new Student(id, major, name, address, age);
		System.out.println(st);
	}
}
