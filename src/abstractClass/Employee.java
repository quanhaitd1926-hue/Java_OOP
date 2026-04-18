package abstractClass;

public abstract class Employee {
	private String name, department;

	public Employee(String name, String department) {
		this.name = name;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public abstract double calculateSalary();

	@Override
	public String toString() {
		return this.name + " " + this.department;
	}

}
