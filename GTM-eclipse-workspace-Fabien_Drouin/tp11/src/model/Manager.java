package model;

public class Manager extends Employe {

	public Manager(String nom, String prenom, int id) {
		super(nom, prenom, id);
	}

	public void validerFormation() {
		System.out.println("Le manager valide la demande de formation");
	}

	@Override
	public String toString() {
		return "Manager [nom=" + nom + ", prenom=" + prenom + ", id=" + id + "]";
	}

}
