package Assignments.Abstract_Interface;

public class Engineer extends Person implements Trainable {
	private String specialty;

	public Engineer(String specialty, String name, int age) {
		super(name, age);
		this.specialty = specialty;
	}

	@Override
	public void attendTraining(String topic) {
		// TODO Auto-generated method stub
		System.out.println("Engineer " + super.getName() + " is attending training on " + topic);
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Engineer " + super.getName() + " is working on " + this.specialty + " project");
	}

}
