package model;

public class Employe {

	// attributs
	protected String nom;
	protected String prenom;
	protected int id;

	// constructeur par default
	public Employe() {
		this("Cassel", "Vincent", 1966);
	}

	// Constructeur employé
	public Employe(String nom, String prenom, int id) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
	}

	// Méthodes

	// Permet d'obtenir et de mettre un nom
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	// Permet d'obtenir et de mettre un prenom
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	// Permet d'obtenir et de mettre un ID
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// demander formation
	public void demanderFormation(String dateDebut, String dateFin) {
		System.out.println("L'employé(e) " + prenom + " " + nom + " a fait une demande une formation");
	}

	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + ", id=" + id + "]";
	}

}
