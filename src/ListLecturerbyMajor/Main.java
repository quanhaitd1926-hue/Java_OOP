package ListLecturerbyMajor;

import java.util.ArrayList;
import java.util.Scanner;

import ListLecturerSort.Lecturer;

public class Main {
	public static String ChuanHoa(String s) {
		String[] arr = s.split("\\s+");
		String major = "";
		for (int i = 0; i < arr.length; i++) {
			major += Character.toUpperCase(arr[i].charAt(0));
		}
		return major;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		ArrayList<Lecturer> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			Lecturer lec = new Lecturer(i + 1, scanner.nextLine(), scanner.nextLine());
			arr.add(lec);
		}
		int q = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < q; i++) {
			String s = scanner.nextLine();
			System.out.println("DANH SACH GIANG VIEN BO MON " + ChuanHoa(s) + ":");
			for (int j = 0; j < n; j++) {
				if (arr.get(j).getMajor().equals(s)) {
					System.out.println(arr.get(j));
				}
			}
		}
	}
}
