package ListLecturerSort;

public class Lecturer {
	private String id, name, major;

	public Lecturer(int id, String name, String major) {
		super();
		this.id = "GV" + String.format("%02d", id);
		this.name = name;
		this.major = major;
	}

	public String ChuanHoaMajor(String s) {
		String[] arr = s.split("\\s+");
		String major = "";
		for (int i = 0; i < arr.length; i++) {
			major += Character.toUpperCase(arr[i].charAt(0));
		}
		return major;
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

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String toString() {
		return this.id + " " + this.name + " " + ChuanHoaMajor(this.major);
	}
}
