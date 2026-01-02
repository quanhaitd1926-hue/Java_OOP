package quanhai19;

import java.util.Scanner;

public class Student {
	private String Id;
	private String Name;
	private String Class;
	private String Date;
	private double gpa;

	public Student(String id, String name, String class1, String date, double gpa) {
		super();
		Id = id;
		Name = name;
		Class = class1;
		Date = date;
		this.gpa = gpa;
	}

	public static StringBuilder ChuanHoaNs(String s) {
		StringBuilder Sb = new StringBuilder(s);
		if (Sb.charAt(1) == '/')
			Sb.insert(0, "0");
		if (Sb.charAt(4) == '/')
			Sb.insert(3, "0");
		return Sb;
	}

	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		Id = "SV001";
		Name = scanner.nextLine();
		Class = scanner.nextLine();
		Date = scanner.nextLine();
		gpa = scanner.nextDouble();
	}

	public void in() {
		System.out.print(Id + " " + Name + " " + Class + " " + ChuanHoaNs(Date) + " ");
		System.out.printf("%.2f", gpa);
	}

}
