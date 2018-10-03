package model;

public class Circle extends Surface implements IPrintable {

	private double radius;

	// constructeur
	public Circle(double radius) {
		this.radius = radius;
	}

	// getters & setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public Double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public void printMe(String text) {
		System.out.println("Je suis un cercle de rayon " + radius);
	}

	@Override
	public String toString() {
		return "Circle [getArea()=" + getArea() + "]";
	}

}
