package UseFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
	private String id, name, className, birth;
	private double gpa;

	public Student(int id, String name, String className, String birth, double gpa) {
		super();
		this.id = "B20DCCN" + String.format("%03d", id);
		this.name = name;
		this.className = className;
		this.birth = birth;
		this.gpa = gpa;
	}

	public String ChuanHoaName(String s) {
		String[] arr = s.split("\\s+");
		String name = "";
		for (int i = 0; i < arr.length; i++) {
			name += Character.toUpperCase(arr[i].charAt(0));
			for (int j = 1; j < arr[i].length(); j++) {
				name += Character.toLowerCase(arr[i].charAt(j));
			}
			name += " ";
		}
		return name.trim();
	}

	public String ChuanHoaBirth(String s) {
		StringBuilder sb = new StringBuilder(s);
		if (sb.charAt(1) == '/')
			sb.insert(0, "0");
		if (sb.charAt(4) == '/')
			sb.insert(3, "0");
		return sb.toString();
	}

	@Override
	public String toString() {
		return this.id + " " + ChuanHoaName(this.name) + " " + this.className + " " + ChuanHoaBirth(this.birth) + " "
				+ String.format("%.2f", this.gpa);
	}

}

public class Test {
	public static void main(String[] args) throws IOException {
		File myObj = new File("input.txt");
		Scanner sc = new Scanner(myObj);
		int n = sc.nextInt();
		ArrayList<Student> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			Student st = new Student(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
			arr.add(st);
		}
		arr.forEach((Student s) -> System.out.println(s));
	}
}
