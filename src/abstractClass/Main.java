package abstractClass;

public class Main {
	public static void main(String[] args) {
		PartTimeEmployee parttime = new PartTimeEmployee(10, 15000, "Nguyen Dinh Hai Quan", "IT");
		FullTimeEmployee fulltime = new FullTimeEmployee(3000, "Nguyen Dinh Hai Quan", "IT");

		Employee[] listEmployee = { fulltime, parttime };
		for (Employee employee : listEmployee) {
			System.out.println(employee.toString());
		}
	}
}
