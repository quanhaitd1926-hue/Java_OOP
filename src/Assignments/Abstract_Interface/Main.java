package Assignments.Abstract_Interface;

public class Main {
	public static void main(String[] args) {
		Engineer myEngin = new Engineer("AI", "Alice", 25);
		Manager myManager = new Manager(10, "Bob", 40);

		Person[] myPerson = { myEngin, myManager };
		for (Person person : myPerson) {
			person.introduce();
			person.work();
			if (person instanceof Trainable) {
				Trainable train = (Trainable) person;
				train.attendTraining("learn Java");
				train.feedback();
			}
		}
	}
}
