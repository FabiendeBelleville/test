package lanceur;

import model.DemandeFormation;
import model.Employe;
import model.Manager;

public class Main {

	public static void main(String[] args) {

//		instancier TP10
//		Employe e1 = new Employe("Drouin", "Fabien", 1986);
//		Manager m1 = new Manager("Drouin", "Tanguy", 1987);
//		DemandeFormation df1 = new DemandeFormation("Maths", "2017", "validé");
//		DemandeFormation df2 = new DemandeFormation();

		// Déclaration
		Manager man;

		// Instanciation
		man = new Manager("Fontaine", "Brigitte", 1939);

//		System.out.println(e1);
		System.out.println(man);
//		System.out.println(df1);
//		System.out.println(df2);

		// Utilisation
		man.validerFormation();
		man.demanderFormation("Ecriture musicale");
		man.setId(54);
		man.setPrenom("Brigitttttte");
		System.out.println(man);

	}

}
