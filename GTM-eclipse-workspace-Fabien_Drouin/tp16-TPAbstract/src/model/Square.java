package model;

public class Square extends Rectangle {

	// constructeur
	public Square(double size) {
		super(size, size);
	}

	@Override
	public String toString() {
		return "Square [getArea()=" + getArea() + "]";
	}
	
	
}
