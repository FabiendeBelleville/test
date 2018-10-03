package models;

public class Manager extends Employe {

	public Manager(String nom, String prenom) {
		super(nom, prenom);
	}

	@Override
	public void demanderUneFormation(DemandeFormation tmpFormation) {
		super.demanderUneFormation(tmpFormation);
		tmpFormation.setEtatValidation(DemandeFormation.ACCEPTE);
	}

	@Override
	public String toString() {
		return "Manager [getNom()=" + getNom() + ", getPrenom()=" + getPrenom() + ", getDemandes()=" + getDemandes()
				+ "]";
	}

	
	
}
