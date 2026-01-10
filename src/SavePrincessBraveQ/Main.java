package SavePrincessBraveQ;

import java.util.Scanner;

//POWER : 100
//BLOOD : 100
//ALIVE
//6
//witch 77
//mushroom
//pea
//pea
//soldier 164
//soldier 137

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int power = Integer.parseInt(scanner.nextLine().substring(8));
		int blood = Integer.parseInt(scanner.nextLine().substring(8));
		String temp = scanner.nextLine();
		boolean alive = false;
		if (temp.equals("ALIVE"))
			alive = true;
		Prince prince = new Prince(power, blood, alive);
		int event = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < event; i++) {
			String s = scanner.nextLine();
			if (s.equals("pea")) {
				prince.pea();
			} else if (s.equals("mushroom")) {
				prince.mushroom();
			} else if (s.charAt(0) == 's') {
				int Power = Integer.parseInt(s.substring(8));
				prince.soldier(Power);
			} else {
				int Power = Integer.parseInt(s.substring(6));
				prince.witch(Power);
			}
			System.out.println(prince);
		}

	}
}
