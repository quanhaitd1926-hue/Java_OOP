package StringJava;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PersonNameFrequency {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = "";
		TreeMap<String, Integer> map = new TreeMap<>();
		while (scanner.hasNextLine()) {
			s = scanner.nextLine();
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
