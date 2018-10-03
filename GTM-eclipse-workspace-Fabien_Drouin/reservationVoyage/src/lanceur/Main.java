package lanceur;

import model.ChezLHabitant;
import model.DerouleVoyageTemplate;
import model.Reservation;
import model.Safari;
import model.TransportLocalAlgerie;
import model.TransportLocalChine;



/**
 * @author Fabien Drouin. Le programme permet de gérer les réservations et les déroulés des différents voyages selon la destination et le type de séjour.
 *
 */
public class Main {

	public static void main(String[] args) {

		System.out.println("*************************");
		DerouleVoyageTemplate voyage1 = new TransportLocalAlgerie();
		voyage1.derouleVoyage();
		System.out.println("");
		Reservation s1 = new Safari("Chasse aux lions");
		System.out.println(s1);
		System.out.println("");
		System.out.println("");
		System.out.println("*************************");

		System.out.println("*************************");
		DerouleVoyageTemplate voyage2 = new TransportLocalChine();
		voyage2.derouleVoyage();
		System.out.println("");
		Reservation h1 = new ChezLHabitant("Séjour chez Fernande");
		System.out.println(h1);
		System.out.println("");
		System.out.println("");
		System.out.println("*************************");

		
		
		
		
		

	}

}
