package Interface;

public class Student extends Person {
	private int mark;
	private String grade;

	public Student(String id, String name, int age, int mark) {
		super(id, name, age);
		this.mark = mark;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade() {
		if (this.mark >= 8)
			this.grade = "A";
		else if (this.mark >= 7 && this.mark < 8)
			this.grade = "B";
		else if (this.mark >= 6 && this.mark < 7)
			this.grade = "C";
		else if (this.mark >= 5 && this.mark < 6)
			this.grade = "D";
		else
			this.grade = "Tach cmnr";
	}

	@Override
	public String toString() {
		return "Student [mark=" + mark + ", grade=" + grade + ", id=" + id + ", name=" + name + ", age=" + age + "]";
	}

//	public String toString() {
//		return super.toString() + " " + this.mark + " " + this.grade;
//	}

}
