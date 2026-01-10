package ListStudentbyClass;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		ArrayList<Student> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			Student t = new Student(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
			arr.add(t);
		}
		int q = scanner.nextInt();
		scanner.nextLine();
		for (int i = 1; i <= q; i++) {
			String s = scanner.nextLine();
			System.out.println("DANH SACH SINH VIEN LOP " + s + ":");
			for (int j = 0; j < n; j++) {
				if (arr.get(j).getClassName().equals(s)) {
					System.out.println(arr.get(j));
				}
			}
		}
	}
}
