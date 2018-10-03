package models;

import java.util.ArrayList;
import java.util.List;

public class Employe {

	private List<DemandeFormation> demandes = new ArrayList<>();
	private String nom;
	private String prenom;

	public void demanderUneFormation(DemandeFormation tmpFormation) {
		demandes.add(tmpFormation);
	}

	public Employe(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<DemandeFormation> getDemandes() {
		return demandes;
	}

	@Override
	public String toString() {
		return "Employe [demandes=" + demandes + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

}
