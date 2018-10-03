package model;

/**
 * 
 * @author Fabien & Madjid;Ceci est la classe Compte Courant qui étend la classe
 *         Compte;
 *         Elle détient plusieurs constructeurs pour une certaine
 *         souplesse de création de compte
 */
public class CompteCourant extends Compte {

	public CompteCourant() {
		this("13 juin 2017", 100, (int) Math.round(Math.random() * 1000000), 1000);
	}

	public CompteCourant(int numeroDeCompte) {
		this("13 juin 2017", 100, numeroDeCompte, 1000);
	}

	public CompteCourant(String dateOuverture, double solde, int numeroDeCompte, double decouvertAutorise) {
		super(dateOuverture, solde, numeroDeCompte, decouvertAutorise);
	}

	@Override
	public String toString() {
		return "CompteCourant [getDateOuverture()=" + getDateOuverture() + ", getSolde()=" + getSolde()
				+ ", getNumeroDeCompte()=" + getNumeroDeCompte() + ", getDecouvertAutorise()=" + getDecouvertAutorise()
				+ "]";
	}

}
