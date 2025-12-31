package StringJava;

import java.util.Scanner;

public class FrequencyCharacter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int[] cnt = new int[256];
		for (int i = 0; i < s.length(); i++) {
			cnt[s.charAt(i)]++;
		}
		for (int i = 0; i < 256; i++) {
			if (cnt[i] != 0) {
				System.out.println((char) i + " " + cnt[i]);
			}
		}
	}
}
