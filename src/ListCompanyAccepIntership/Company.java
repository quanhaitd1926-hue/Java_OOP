package ListCompanyAccepIntership;

public class Company {
	private String id, name;
	private int quantityStudent;

	public Company(String id, String name, int quantityStudent) {
		super();
		this.id = id;
		this.name = name;
		this.quantityStudent = quantityStudent;
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

	public int getQuantityStudent() {
		return quantityStudent;
	}

	public void setQuantityStudent(int quantityStudent) {
		this.quantityStudent = quantityStudent;
	}

	public String toString() {
		return this.id + " " + this.name + " " + this.quantityStudent;
	}
}
