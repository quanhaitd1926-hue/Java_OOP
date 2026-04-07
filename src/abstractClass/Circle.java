package abstractClass;

public class Circle extends GeometricObject {
	private double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	double getArea() {
		return 3.14 * radius * radius;
	}

	@Override
	double getPerimeter() {
		return 2 * 3.14 * radius;
	}

}
