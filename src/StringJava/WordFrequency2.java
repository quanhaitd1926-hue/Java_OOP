package StringJava;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String[] arr = s.split("\\s+");
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for (String x : arr) {
			map.put(x, map.getOrDefault(x, 0) + 1);
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
