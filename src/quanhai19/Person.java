package quanhai19;

public class Person {
	private String name, birth;

	public Person(String name, String birth) {
		super();
		this.name = name;
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birth=" + birth + "]";
	}

}
