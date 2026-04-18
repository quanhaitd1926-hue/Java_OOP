package Polymorphism;

public class Main {
	public static void main(String[] args) {
		Car myCar = new Car("toyota");
		Bus myBus = new Bus("vin");
		Motorbike myMotorbike = new Motorbike("honda");

		Vehicle[] vehicle = { myCar, myBus, myMotorbike };
		for (Vehicle x : vehicle) {
			x.start();
		}
	}
}
