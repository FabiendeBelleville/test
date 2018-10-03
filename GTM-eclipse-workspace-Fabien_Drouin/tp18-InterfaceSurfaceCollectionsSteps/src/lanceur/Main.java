package lanceur;

import model.Surface;
import model.Rectangle;
import model.Square;
import model.Circle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import model.AreaCalculator;

public class Main {
	public static void main(String[] args) {

		Surface circle = new Circle(100.0);
		Surface rectangle = new Rectangle(100.0, 100.0);
		Surface squareParis = new Square(10000);

		List<Surface> listSurface = new ArrayList<>();
		// listSurface.add(circle);
		// listSurface.add(rectangle);
		// listSurface.add(square);

//		System.out.println(listSurface);
//		System.out.println(listSurface.size());
//		listSurface.remove(square);
//		System.out.println(listSurface);
//		System.out.println(listSurface.size());
//		System.out.println(listSurface.get(1));

		for (int i = 0; i < 10; i++) {
			Square s = new Square(i * 2);
			listSurface.add(s);
		}

		// System.out.println(listSurface.get(673));

//Test 1 : itération et modification d'une Collection
//Ne jamais faire de suppression en masse dans une boucle

//		for (Surface surface : listSurface) {
//			System.out.println("before remove : " + listSurface.size());
//			if (surface.getArea() > 10)
//				listSurface.remove(surface);
//			System.out.println("after remove : " + listSurface.size());
//			}	
//		for (Iterator<Surface> variable = listSurface.iterator(); variable.hasNext();) {
//			Surface var2 = variable.next();
//			System.out.println(
//					"avant de supprimer quoi que ce soit, la longueur de la liste est : " + listSurface.size());
//			if (var2.getArea() > 36.1)
//				variable.remove();
//			System.out.println("après le test de condition et la suppression eventuelle, la longueur de la liste est : "
//					+ listSurface.size());
//		}
		System.out.println("avant de commencer à supprimer, la longueur de la liste est : " + listSurface.size());
		listSurface.removeIf(s -> s.getArea() > 200);
		System.out.println("après le test de condition et la suppression eventuelle, la longueur de la liste est : "
				+ listSurface.size());

		System.out.println(listSurface);

		HashMap<Integer, Surface> map = new HashMap<>();

		map.put(-1, circle);
		map.put(-2, rectangle);
		map.put(-3, squareParis);

		System.out.println("");

		System.out.println(map.get("cercle"));
		System.out.println(map.get("rectangle"));

		System.out.println(map.get("carré"));
		map.remove("cercle");
		System.out.println(map.get("cercle"));
		System.out.println(map.values());

		int i = 0;
		for (Surface variabletmp : listSurface) {
			i = i + 1;
			map.put(i, variabletmp);

		}

		System.out.println("***********************************************");
		System.out.println(map.keySet());
		Set<Integer> keys = map.keySet();
		for (Integer clesDuSet : keys) {

			System.out.println("la map contient " + map.get(clesDuSet));

		}

	}
}