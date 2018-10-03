package model;

public class CircleCustomEx {

	private double radius;

	public CircleCustomEx(double radius) throws InvalidRadiusException {
		setRadius(radius);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) throws InvalidRadiusException {
		if (radius < 0) {
			throw new InvalidRadiusException(radius);
		}
		this.radius = radius;
	}
}
