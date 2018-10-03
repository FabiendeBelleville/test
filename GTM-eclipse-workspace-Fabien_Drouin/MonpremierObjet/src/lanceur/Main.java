package lanceur;

import model.Person;

public class Main {

	public static void main(String[] args) {

		// Création d'un objet Person

//		Person p1 = new Person();
//		p1.name = "Fabien";
//		p1.age = 32;
//		p1.saluer();

		System.out.println("");

		// Création d'un autre objet Person

//		Person p2 = new Person();
//		p2.name = "Jacky";
//		p2.age = 57;
//		p2.saluer();

		for (int i = 1; i < 4; i++) {
//		for (;;) {

			Person p = new Person();
			p.name = "Mec " + i;
			p.age = 40 + i;
			p.car.brand = "Renault de " + (i + 2000) + " comme neuve !";
			p.saluer();
			System.out.println("");
		}
	}

}
