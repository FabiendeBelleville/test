package model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AreaCalculator {

	// méthode avec Varags
	public static double SumArea(Surface... surfacelesSurfaces) {
		double somme = 0;
		for (Surface surface : surfacelesSurfaces) {
			somme += surface.getArea();
		}
		return somme;
	}

	public static List<Surface> orderSurfaces(Surface... surfaces) {
		List<Surface> list = Arrays.asList(surfaces);
		Collections.sort(list, Collections.reverseOrder());
		return list;
	}

}