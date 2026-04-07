package Interface;

public interface IAnimal {
	public void animalSound();

	public void run();

	default public String sleep() {
		return "Zzz";
	}
}
