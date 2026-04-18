package OOP;

public class Student extends Person {
	private String id, major;

	public Student(String id, String major, String name, String address, int age) {
		super(name, address, age);
		this.id = id;
		this.major = major;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return super.toString() + " " + this.id + " " + this.major;
	}

}
