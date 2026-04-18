package Enum;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào trạng thái đơn hàng: ");
		String status = sc.nextLine().toUpperCase();

		try {
			OrderStatus input = OrderStatus.valueOf(status);
			System.out.println("Trạng thái: " + input.getStatus());
			System.out.println("Trạng thái cuối cùng: " + input.hasFinal());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Trạng thái không hợp lệ.");
		}
		sc.close();
	}
}
