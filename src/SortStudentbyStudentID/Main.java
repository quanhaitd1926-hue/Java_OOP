package SortStudentbyStudentID;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		Collections.sort(arr, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getId().compareTo(o2.getId());
			}

		});

		for (int i = 0; i < n; i++) {
			System.out.println(arr.get(i));
		}
	}
}
