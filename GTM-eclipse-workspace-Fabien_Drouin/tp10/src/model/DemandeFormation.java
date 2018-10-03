package model;

public class DemandeFormation {

	// attributs
	private String theme;
	private String dateDemande;
	private String etatValidation;

	// constructeur par default
	public DemandeFormation() {
		this("Comédie", "1986", "en attente");
	}

	// constructeur

	public DemandeFormation(String theme, String dateDemande, String etatValidation) {
		super();
		this.theme = theme;
		this.dateDemande = dateDemande;
		this.etatValidation = etatValidation;
	}

	// méthodes

	// getters and setters
	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getDateDemande() {
		return dateDemande;
	}

	public void setDateDemande(String dateDemande) {
		this.dateDemande = dateDemande;
	}

	public String getEtatValidation() {
		return etatValidation;
	}

	public void setEtatValidation(String etatValidation) {
		this.etatValidation = etatValidation;
	}

	@Override
	public String toString() {
		return "DemandeFormation [theme=" + theme + ", dateDemande=" + dateDemande + ", etatValidation="
				+ etatValidation + "]";
	}

}
