package Polymorphism;

public class Bus extends Vehicle {
	public Bus(String brand) {
		super(brand);
	}

	@Override
	public void start() {
		System.out.printf("Bus %s is starting with air brakes ...\n", super.getBrand());
	}
}
