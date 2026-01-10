package ListStudentbyCourse;

import java.util.ArrayList;
import java.util.Scanner;

import SortStudentbyClass.Student;

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
		for (int i = 0; i < q; i++) {
			String s = scanner.nextLine();
			System.out.println("DANH SACH SINH VIEN KHOA " + s + ":");
			for (int j = 0; j < n; j++) {
				String course1 = arr.get(j).getClassName().substring(1, 3);
				String course2 = s.substring(2, 4);
				if (Integer.parseInt(course1) == Integer.parseInt(course2)) {
					System.out.println(arr.get(j));
				}
			}
		}
	}
}
