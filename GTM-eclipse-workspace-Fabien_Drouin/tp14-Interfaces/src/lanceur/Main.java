package lanceur;

import DAOFab.DAOimplementation;
import model.Rectangle;

public class Main {
	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {

			Rectangle r1 = new Rectangle(i, i);
			System.out.println(r1);

			DAOimplementation.sauverEnDB(i, r1.getWidth(), r1.getHeight(), r1.getArea());
		}
	}
}