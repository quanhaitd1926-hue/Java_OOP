package TryCatch;

public class Student {
	private String id, name;
	private double gpa;
	private int age;

	public Student(String id, String name, double gpa, int age) {
		super();
		this.id = id;
		this.name = name;
		this.gpa = gpa;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return this.id + " " + this.name + " " + this.gpa + " " + this.age;
	}
}
