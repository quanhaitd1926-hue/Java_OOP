package abstractClass;

public class Rectangle extends GeometricObject {
	private double width, length;

	public Rectangle(String color, double width, double length) {
		super(color);
		this.width = width;
		this.length = length;
	}

	@Override
	double getArea() {
		return width * length;
	}

	@Override
	double getPerimeter() {
		return (width + length) * 2;
	}

}
