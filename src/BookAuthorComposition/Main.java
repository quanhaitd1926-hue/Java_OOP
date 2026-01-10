package BookAuthorComposition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		ArrayList<Book> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String name = scanner.nextLine();
			double price = scanner.nextDouble();
			int quantity = scanner.nextInt();
			scanner.nextLine();
			Author a = new Author(scanner.nextLine(), scanner.nextLine(), scanner.nextLine().charAt(0));
			Book b = new Book(name, a, price, quantity);
			arr.add(b);
		}
		Collections.sort(arr, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				if (o1.getPrice() != o2.getPrice()) {
					if (o1.getPrice() > o2.getPrice())
						return -1;
					else
						return 1;
				} else {
					return o1.getName().compareTo(o2.getName());
				}
			}

		});

		for (int i = 0; i < n; i++) {
			System.out.println(arr.get(i));
		}
	}
}
