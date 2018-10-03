package model;

public class Circle {

	private double radius;

	public Circle(double radius) {
		setRadius(radius);

		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius < 0) {
			throw new IllegalArgumentException("Rayon négatif !");
		}
		this.radius = radius;
	}

}
