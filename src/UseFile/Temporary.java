package UseFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Temporary {
	public static String ChuanHoa(String s) {
		String[] arr = s.split("\\s+");
		String name = "";
		for (int i = 0; i < arr.length; i++) {
			name += Character.toUpperCase(arr[i].charAt(0));
			for (int j = 1; j < arr[i].length(); j++) {
				name += Character.toLowerCase(arr[i].charAt(j));
			}
			name += " ";
		}
		return name.trim();
	}

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("output.txt", true);
			File file = new File("input.txt");
			Scanner sc = new Scanner(file);
			ArrayList<Integer> arr = new ArrayList<>();
			while (sc.hasNextLine()) {
				String name = sc.nextLine();
				writer.write(ChuanHoa(name) + "\n");
			}
			writer.close();
			sc.close();
		} catch (IOException e) {
			System.out.println(e);
		}

	}
}
