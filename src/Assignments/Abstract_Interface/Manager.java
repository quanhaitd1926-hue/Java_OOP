package Assignments.Abstract_Interface;

public class Manager extends Person implements Trainable {
	private int teamSize;

	public Manager(int teamSize, String name, int age) {
		super(name, age);
		this.teamSize = teamSize;
	}

	@Override
	public void attendTraining(String topic) {
		// TODO Auto-generated method stub
		System.out.println("Manager " + super.getName() + " is attending management training on " + topic);
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Manager " + super.getName() + " is managing a team of" + this.teamSize + " people");
	}

}
