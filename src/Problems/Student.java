package Problems;

public class Student extends Person {
	private String className;
	private double gpa;

	public Student(String name, String birth) {
		super(name, birth);
	}

	public Student(String name, String birth, String className, double gpa) {
		super(name, birth);
		this.className = className;
		this.gpa = gpa;
	}

	public void xinchao() {
		System.out.println("Hello World!");
	}

}
