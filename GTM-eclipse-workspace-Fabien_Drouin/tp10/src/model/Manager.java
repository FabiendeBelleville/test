package model;

public class Manager {

	// attributs
	private String nom;
	private String prenom;
	private int id;

	// constructeur par default
	public Manager() {
		this("Cassel", "Vincent", 1966);
	}

	// Constructeur manager
	public Manager(String nom, String prenom, int id) {
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
	public void demanderFormation(String theme) {
		System.out.println("L'employé(e)" + prenom + "" + nom + " demande une formation sur le thème " + theme);
	}

	// valider formation
	public void validerFormation(String theme) {

	}

	@Override
	public String toString() {
		return "Manager [nom=" + nom + ", prenom=" + prenom + ", id=" + id + "]";
	}

}
