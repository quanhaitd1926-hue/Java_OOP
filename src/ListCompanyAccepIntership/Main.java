package ListCompanyAccepIntership;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Company> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			Company c = new Company(scanner.nextLine(), scanner.nextLine(), scanner.nextInt());
			arr.add(c);
		}
		Collections.sort(arr, new Comparator<Company>() {

			@Override
			public int compare(Company o1, Company o2) {
				if (o1.getQuantityStudent() > o2.getQuantityStudent())
					return -1;
				else
					return 1;
			}

		});

		for (int i = 0; i < n; i++) {
			System.out.println(arr.get(i));
		}

	}
}
