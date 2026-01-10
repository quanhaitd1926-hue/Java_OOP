package ListLecturerSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static String getLastName(String s) {
		String[] arr = s.split("\\s+");
		int n = arr.length - 1;
		String name = arr[n];
		return name.toLowerCase();
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
		Collections.sort(arr, new Comparator<Lecturer>() {

			@Override
			public int compare(Lecturer o1, Lecturer o2) {
				if (getLastName(o1.getName()).compareTo(getLastName(o2.getName())) != 0) {
					return getLastName(o1.getName()).compareTo(getLastName(o2.getName()));
				} else {
					return o1.getId().compareTo(o2.getId());
				}
			}

		});

		for (int i = 0; i < n; i++) {
			System.out.println(arr.get(i));
		}
	}
}
