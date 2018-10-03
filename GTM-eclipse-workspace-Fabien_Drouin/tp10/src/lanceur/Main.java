package lanceur;

import model.DemandeFormation;
import model.Employe;
import model.Manager;

public class Main {

	public static void main(String[] args) {

		// variables
//		Employe employe;
//		Manager manager;
//		DemandeFormation demandeformation;

		// instancier
		Employe e1 = new Employe("Drouin", "Fabien", 1986);
		Manager m1 = new Manager("Drouin", "Tanguy", 1987);
		DemandeFormation df1 = new DemandeFormation("Maths", "2017", "validé");
		DemandeFormation df2 = new DemandeFormation();

		System.out.println(e1);
		System.out.println(m1);
		System.out.println(df1);
		System.out.println(df2);
	}

}
