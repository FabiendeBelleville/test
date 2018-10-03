package lanceur;

import model.DemandeFormation;
import model.Employe;
import model.Manager;

public class Main {

	public static void main(String[] args) {

//		instancier TP10
//		Employe e1 = new Employe("Drouin", "Fabien", 1986);
//		Manager m1 = new Manager("Drouin", "Tanguy", 1987);
		DemandeFormation df1 = new DemandeFormation("2018", "2026");
//		DemandeFormation df2 = new DemandeFormation();

		// Déclaration
		Manager man;

		// Instanciation
		man = new Manager("Fontaine", "Brigitte", 1939);
		Manager man2 = new Manager("dfgh");

//		System.out.println(e1);
	//	System.out.println(man);
//		System.out.println(df1);
//		System.out.println(df2);

		// Utilisation
	//	man.validerFormation();
		
		man.setId(54);
		man.setPrenom("Brigitte");
		//System.out.println(man);
	
		
		
		
		
		
		
		
		
		System.out.println("**********************");
	//	System.out.println(man2);
	//	System.out.println(df1);
		
		
		
		System.out.println("**********************");
		System.out.println("**********************");
		man.demanderFormation("2000", "2018");
	}

}
