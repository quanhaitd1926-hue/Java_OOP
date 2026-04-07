package LambdaExpressions;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("alpha");
		arr.add("beta");
		arr.add("dm");
		arr.add("dkm");
		for (String x : arr)
			System.out.println(x);
		System.out.println("----------------");
		arr.forEach((s) -> System.out.println(s));
		System.out.println("----------------");
		arr.forEach((String s) -> {
			char first = s.charAt(0);
			System.out.println(s + " means " + first);
		});
	}
}
