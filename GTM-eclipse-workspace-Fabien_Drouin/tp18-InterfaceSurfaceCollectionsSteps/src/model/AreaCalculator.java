package model;

public class AreaCalculator {

	//méthode avec Varags
	public static double SumArea(Surface... surfacelesSurfaces) {
		double somme = 0;
		for (Surface surface : surfacelesSurfaces) {
			somme += surface.getArea();
		}
		return somme;
	}
}