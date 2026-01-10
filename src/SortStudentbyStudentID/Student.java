package SortStudentbyStudentID;

public class Student {
	private String id, name, className, email;

	public Student(String id, String name, String className, String email) {
		super();
		this.id = id;
		this.name = name;
		this.className = className;
		this.email = email;
	}

	public String ChuanHoaName(String s) {
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

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return this.id + " " + ChuanHoaName(this.name) + " " + this.className + " " + this.email;
	}
}
