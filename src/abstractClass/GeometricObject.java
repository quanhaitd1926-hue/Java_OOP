package abstractClass;

public abstract class GeometricObject {
	private String Color;

	abstract double getArea();

	abstract double getPerimeter();

	public GeometricObject(String color) {
		super();
		Color = color;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

}
