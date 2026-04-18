package abstractClass;

public class FullTimeEmployee extends Employee {
	private double monthlySalary;

	public FullTimeEmployee(double monthlySalary, String name, String department) {
		super(name, department);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double calculateSalary() {
		return this.monthlySalary;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	@Override
	public String toString() {
		return this.monthlySalary + " " + super.toString();
	}

}
