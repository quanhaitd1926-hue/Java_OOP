package Polymorphism;

public class Car extends Vehicle {
	public Car(String brand) {
		super(brand);
	}

	@Override
	public void start() {
		System.out.printf("Car %s is starting with key ...\n", super.getBrand());
	}
}
