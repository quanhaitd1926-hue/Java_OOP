package quanhai19;

public class Student extends Person {
	private String id, className;
	private double gpa;
	private int drl;

	public Student(String name, String birth, String id, String className, double gpa, int drl) {
		super(name, birth);
		this.id = id;
		this.className = className;
		this.gpa = gpa;
		this.drl = drl;
	}

	public String chuanHoaName(String s) {
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

	public StringBuilder chuanHoaDate(String s) {
		StringBuilder Sb = new StringBuilder(s);
		if (Sb.charAt(1) == '/')
			Sb.insert(0, "0");
		if (Sb.charAt(4) == '/')
			Sb.insert(3, "0");
		return Sb;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getDrl() {
		return drl;
	}

	public void setDrl(int drl) {
		this.drl = drl;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", className=" + className + ", gpa=" + gpa + ", drl=" + drl + ", toString()="
				+ super.toString() + "]";
	}

}
