package Polymorphism;

public class Motorbike extends Vehicle {
	public Motorbike(String brand) {
		super(brand);
	}

	@Override
	public void start() {
		System.out.printf("Motorbike %s is kick starting...\n", super.getBrand());
	}
}
