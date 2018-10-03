package model;

public class Manager extends Employe {

	public Manager(String nom, String prenom, int id) {
		super(nom, prenom, id);
	}

	public Manager(String nom, String prenom) {
		this(nom, prenom, 999);
	}

	public Manager(String nom) {
		this(nom, "Franck", 998);
	}

	public Manager() {
		this("Thenard", "Francky", 997);
	}

	public void validerFormation() {
		System.out.println("Le manager valide la demande de formation");
	}

	@Override
	public void demanderFormation(String dateDebut, String dateFin) {

		// super.demanderFormation(dateDebut, dateFin);
		System.out.println(
				getPrenom() + " " + getNom() + " " + "revendique une formation du " + dateDebut + " au " + dateFin);
		System.out.println("Etant manager, il valide ses propres formations");
	}

	@Override
	public String toString() {
		return "Manager [nom=" + nom + ", prenom=" + prenom + ", id=" + id + "]";
	}

}
