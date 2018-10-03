package model;

public class InvalidRadiusException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	double radius;

	public InvalidRadiusException(double radius) {
		super("l'erreur vient du radius qui est " + radius);
		System.out.println("Rayon négatif");
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
}