package StringJava;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String[] arr = s.split("\\s+");
		Arrays.sort(arr);
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for (String word : arr) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
//		for (int i = 0; i < arr.length; i++) {
//			if (map.get(arr[i]) != 0) {
//				System.out.println(arr[i] + " " + map.get(arr[i]));
//				map.put(arr[i], 0);
//			}
//		}
	}
}
