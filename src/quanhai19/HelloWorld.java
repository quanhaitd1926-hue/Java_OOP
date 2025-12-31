package quanhai19;

import java.util.Scanner;

public class HelloWorld {
	public static String ChuanHoaName(String s) {
		String[] arr = s.split("\\s+");
		String Name = "     ";
		for (int i = 0; i < arr.length; i++) {
			Name += Character.toUpperCase(arr[i].charAt(0));
			for (int j = 1; j < arr[i].length(); j++) {
				Name += Character.toLowerCase(arr[i].charAt(j));
			}
			Name += " ";
		}
		return Name.trim();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		System.out.println(ChuanHoaName(s));
	}
}
