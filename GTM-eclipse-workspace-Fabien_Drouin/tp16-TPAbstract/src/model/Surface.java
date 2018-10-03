package model;

public abstract class Surface implements Comparable<Surface> {

	@Override
	public int compareTo(Surface o) {
		if (getArea() > o.getArea()) {
			return 1;
		} else if (getArea() < o.getArea()) {
			return -1;
		}
		return 0;
	}

	public abstract Double getArea();

}