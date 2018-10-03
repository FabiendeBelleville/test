package lanceur;

import model.Marguaritta;
import model.PizzaTemplate;
import model.Reine;

public class Main {

	public static void main(String[] args) {

		PizzaTemplate pizza1 = new Marguaritta();
		pizza1.makePizza();
		System.out.println("");

		PizzaTemplate pizza2 = new Reine();
		pizza2.makePizza();
		System.out.println("");
	}

}
