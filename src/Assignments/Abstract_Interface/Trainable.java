package Assignments.Abstract_Interface;

public interface Trainable {
	public void attendTraining(String topic);

	default void feedback() {
		System.out.println("Thank for training session!");
	}
}
