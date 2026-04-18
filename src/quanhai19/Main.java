package quanhai19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {
	public static void reader() {
		try (FileReader fr = new FileReader("src/quanhai19/input.txt"); BufferedReader br = new BufferedReader(fr);) {
			ArrayList<Student> arr = new ArrayList<>();
			String line = "";
			while ((line = br.readLine()) != null) {
				String[] tmp = line.split(",");
				Student st = new Student(tmp[0], Double.parseDouble(tmp[1]));
				arr.add(st);
			}
			for (Student s : arr) {
				System.out.println(s);
			}
		} catch (Exception e) {
			
			System.out.println(e);
		}
	}

	public static void writer() {
		try (FileWriter fr = new FileWriter("src/quanhai19/output.txt");
				BufferedWriter bw = new BufferedWriter(fr);
				PrintWriter pw = new PrintWriter(bw);) {

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		reader();
	}
}
