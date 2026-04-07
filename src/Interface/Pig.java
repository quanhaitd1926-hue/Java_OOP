package Interface;

public class Pig implements IAnimal {

	@Override
	public void animalSound() {
		System.out.println("the pig says : weee wee");

	}

	@Override
	public void run() {
		System.out.println("runing");

	}

}
