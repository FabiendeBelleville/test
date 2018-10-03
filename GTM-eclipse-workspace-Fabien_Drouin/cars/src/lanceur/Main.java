package lanceur;

import java.util.Scanner;

import model.Car;
import model.Person;

/**
 * @author Fabien Drouin. Le programme permet de gérer l'attribution des
 *         véhicules de la famille aux différents membres de cette dernière. *
 */
public class Main {

	public static void main(String[] args) {

		Person p1 = new Person("Bruno", "G", 1959, "");
//		p1.setName("Fabien");
//		p1.setSurname("Drouin");
//		p1.setBirthYear(1986);

		Person p2 = new Person();
//		p2.setName("Tanguy");
//		p2.setSurname("Drouin");
//		p2.setBirthYear(1987);

		Person p3 = new Person();
//		p3.setName("Brice");
//		p3.setSurname("Drouin");
//		p3.setBirthYear(1992);

		Person p4 = new Person();
		p4.setName("Katerina");
		p4.setSurname("Giannouli");
		p4.setBirthYear(1990);

		Car c1 = new Car();
		c1.setBrand("1. Renault");
		c1.setModel("Twingo");
		c1.setBirthYear(1998);

		Car c2 = new Car();
		c2.setBrand("2. BMW");
		c2.setModel("528i");
		c2.setBirthYear(2000);

		Car c3 = new Car();
		c3.setBrand("3. Peugeot");
		c3.setModel("308");
		c3.setBirthYear(2017);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
//
//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println(c3);

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("");
//		System.out.println("Fais un voeux de voiture 1, 2 ou 3");
//		int voeux = scanner.nextInt();
//		scanner.nextLine();
//		System.out.println("Tu as fait le voeux d'avoir la voiture n°" + voeux);
//		scanner.close();

	}

}
