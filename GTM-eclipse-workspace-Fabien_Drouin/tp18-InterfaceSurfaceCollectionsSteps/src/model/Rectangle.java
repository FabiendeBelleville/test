package model;

public class Rectangle implements Surface {

	private double width, height;

	// constructeur
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	// getters & setters
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public Double getArea() {
		return width * height;
	}

	@Override
	public String toString() {
		return "Rectangle [getArea()=" + getArea() + "]";
	}

}
