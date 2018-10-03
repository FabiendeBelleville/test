package model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import models.DemandeFormation;
import models.Employe;
import models.Manager;

class FormationTest {

	@Test
	void employeDoitAvoirFormationEnAttente() {
		Employe e1 = new Employe("DROUIN", "Fabien");
		DemandeFormation demande1 = new DemandeFormation("Violon-Alto");
		DemandeFormation demande2 = new DemandeFormation("Boat-Hitchhiking");
		DemandeFormation demande3 = new DemandeFormation("Blockchain");

		e1.demanderUneFormation(demande1);
		e1.demanderUneFormation(demande2);
		e1.demanderUneFormation(demande3);

		List<DemandeFormation> variableListe = e1.getDemandes();

		for (DemandeFormation demandeFormation : variableListe) {
			assertTrue(DemandeFormation.ATTENTE.equals(demandeFormation.getEtatValidation()));
		}
		System.out.println(e1);
		System.out.println("************************************************************");
	}

	@Test
	void managerDoitAvoirFormationAcceptee() {
		
		Manager m1 = new Manager("LeChef", "Fred");
		DemandeFormation demande4 = new DemandeFormation("Soudure cuivre");
		m1.demanderUneFormation(demande4);
		
		List<DemandeFormation> variableListe = m1.getDemandes();
		
		for (DemandeFormation demandeFormation : variableListe) {
			assertTrue(DemandeFormation.ACCEPTE.equals(demandeFormation.getEtatValidation()));
		}
		
		System.out.println(m1);
		System.out.println("************************************************************");

	}
}
