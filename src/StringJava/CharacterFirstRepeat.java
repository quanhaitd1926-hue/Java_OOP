package StringJava;

import java.util.Scanner;

public class CharacterFirstRepeat {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int[] cnt = new int[256];
		int check = 0;
		for (int i = 0; i < s.length(); i++) {
			cnt[s.charAt(i)]++;
			if (cnt[s.charAt(i)] == 2) {
				System.out.println((char) s.charAt(i));
				check = 1;
				break;
			}
		}
		if (check == 0)
			System.out.println("NONE");
	}
}
