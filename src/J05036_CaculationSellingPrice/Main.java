package J05036_CaculationSellingPrice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<DepartmentStore> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			DepartmentStore d = new DepartmentStore(i + 1, scanner.nextLine(), scanner.nextLine(), scanner.nextDouble(),
					scanner.nextInt());
			arr.add(d);
		}
		arr.forEach((DepartmentStore ds) -> System.out.println(ds));
	}
}
