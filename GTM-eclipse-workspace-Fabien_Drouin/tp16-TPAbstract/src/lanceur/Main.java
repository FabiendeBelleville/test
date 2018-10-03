package lanceur;

import model.Surface;
import model.Rectangle;
import model.Square;
import model.AreaCalculator;
import model.Circle;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		Surface circle = new Circle(100.0);
		Surface rectangle = new Rectangle(100.0, 100.0);
		Surface squareParis = new Square(10000);

		List<Surface> listSurface = new ArrayList<>();
		int caca = 50;
//		Surface[] tab = { 
//				for (int i = 0; i < caca; i++) ;
//			Square s = new Square(i * 2);
//		};

		// Surface[] tab1=listSurface.toArray(new Surface[listSurface.size()]);

		Surface[] tab = new Surface[caca];
		for (int i = 0; i < caca; i++) {
			Square s = new Square(i * 2);
			listSurface.add(s);
			tab[i] = s;
		}

//
//		System.out.println("avant de commencer à supprimer, la longueur de la liste est : " + listSurface.size());
//		listSurface.removeIf(s -> s.getArea() > 200);
//		System.out.println("après le test de condition et la suppression eventuelle, la longueur de la liste est : "
//				+ listSurface.size());
//
		System.out.println("****");
		System.out.println(listSurface);
		System.out.println("****");

		List<Surface> list = AreaCalculator.orderSurfaces(circle, rectangle, squareParis);
		for (Surface surface : list) {
			System.out.println(surface);
		}
		System.out.println("***************************************");
		System.out.println(AreaCalculator.orderSurfaces(tab));
		System.out.println("***************************************");

	}
}