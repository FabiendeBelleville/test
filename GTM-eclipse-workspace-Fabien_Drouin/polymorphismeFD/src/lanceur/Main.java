package lanceur;

import java.util.ArrayList;
import java.util.List;
import model.Citadine;
import model.Familiale;
import model.Sport;
import model.Voiture;

/**
 * @author Fabien Drouin. Le programme permet de définir différentes
 *         caractéristiques de voiture selon leur catégorie d'appartenance. Il
 *         utilise la notion de polymorphisme
 *
 */
public class Main {

	public static void main(String[] args) {

		List<Voiture> liste = new ArrayList<>();

		Citadine citadine1 = new Citadine();
		liste.add(citadine1);
		Familiale familiale1 = new Familiale();
		liste.add(familiale1);
		Sport sport1 = new Sport();
		liste.add(sport1);
		
		System.out.println("Le programme définit les caractéristiques de différentes catégorie de voiture");
		System.out.println("Le programme utilise la notion de polymorphisme");
		
		for (Voiture voiture : liste) {
			System.out.println("****************************");
			voiture.categorie();
			voiture.vitesseMax();
			voiture.acceleration();
			voiture.rayonDeBraquage();
			voiture.volume();
			System.out.println("****************************");
		}

	}

}
