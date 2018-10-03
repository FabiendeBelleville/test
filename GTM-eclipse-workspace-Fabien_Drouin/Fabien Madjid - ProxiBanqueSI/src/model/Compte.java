package model;

/**
 * 
 * @author Fabien & Madjid; Ceci est la classe abstraite Compte.
 * Elle contient 4 attributs, un constructeur, et les getters et setters des attributs.
 * Elle ne contient aucune méthode
 */
public abstract class Compte {
// Attributs
	private String dateOuverture;
	private double solde;
	private int numeroDeCompte;
	private double decouvertAutorise;

// Constructeur
	public Compte(String dateOuverture, double solde, int numeroDeCompte, double decouvertAutorise) {
		this.dateOuverture = dateOuverture;
		this.solde = solde;
		this.numeroDeCompte = numeroDeCompte;
		this.decouvertAutorise = decouvertAutorise;
	}

//Getters & setters
	public String getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public int getNumeroDeCompte() {
		return numeroDeCompte;
	}

	public void setNumeroDeCompte(int numeroDeCompte) {
		this.numeroDeCompte = numeroDeCompte;
	}

	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}

	public void setDecouvertAutorise(double decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}

// Méthodes

}
