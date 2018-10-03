package model;

/**
 * 
 * @author Fabien & Madjid;Ceci est la classe Compte Epargne qui étend la classe
 *         Compte;
 *         Elle détient plusieurs constructeurs pour une certaine
 *         souplesse de création de compte
 *
 */
public class CompteEpargne extends Compte {

	public CompteEpargne() {
		this("16 mai 2002", 20, (int) Math.round(Math.random() * 1000000), 0);
	}

	public CompteEpargne(int numeroDeCompte) {
		this("16 mai 2002", 20, numeroDeCompte, 0);
	}

	public CompteEpargne(String dateOuverture, double solde, int numeroDeCompte, double decouvertAutorise) {
		super(dateOuverture, solde, numeroDeCompte, decouvertAutorise);
	}

	@Override
	public String toString() {
		return "CompteEpargne [getDateOuverture()=" + getDateOuverture() + ", getSolde()=" + getSolde()
				+ ", getNumeroDeCompte()=" + getNumeroDeCompte() + ", getDecouvertAutorise()=" + getDecouvertAutorise()
				+ "]";
	}

}
