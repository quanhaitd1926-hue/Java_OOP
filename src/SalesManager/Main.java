package SalesManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		ArrayList<Customer> cus = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int id = i + 1;
			String name = scanner.nextLine();
			String gender = scanner.nextLine();
			String birth = scanner.nextLine();
			String address = scanner.nextLine();
			Customer c = new Customer(id, name, gender, birth, address);
			cus.add(c);
		}
		int m = scanner.nextInt();
		scanner.nextLine();
		ArrayList<Items> item = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			int id = i + 1;
			String name = scanner.nextLine();
			String unit = scanner.nextLine();
			int purchasePrice = scanner.nextInt();
			int sellingPrice = scanner.nextInt();
			Items it = new Items(id, name, unit, purchasePrice, sellingPrice);
			item.add(it);
			scanner.nextLine();
		}
		int k = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < k; i++) {
			System.out.print("HD" + String.format("%03d", i + 1) + " ");
			String s = scanner.nextLine();
			String[] bill = s.split("\\s+");
			for (int j = 0; j < n; j++) {
				if (cus.get(j).getIdCus().equals(bill[0])) {
					System.out.print(cus.get(j).getNameCus() + " " + cus.get(j).getAddress() + " ");
					break;
				}
			}
			int price = 0;
			for (int j = 0; j < m; j++) {
				if (item.get(j).getIdItem().equals(bill[1])) {
					System.out.print(item.get(j).getNameItem() + " " + item.get(j).getUnit() + " "
							+ item.get(j).getPurchasePrice() + " " + item.get(j).getSellingPrice() + " ");
					price = item.get(j).getSellingPrice();
					break;
				}
			}
			int quantity = Integer.parseInt(bill[2]);
			price *= quantity;
			System.out.print(quantity + " " + price);

			System.out.println();

		}
	}
}
