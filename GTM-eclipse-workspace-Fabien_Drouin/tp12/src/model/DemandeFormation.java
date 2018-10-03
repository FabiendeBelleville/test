package model;

public class DemandeFormation {

	// attributs
	private String theme;
	private String dateDemande;
	private String etatValidation;
	private String dateDebut;
	private String dateFin;
	private final static String REFUS = "refus";
	private final static String ACCORDE = "valide";
	private final static String ATTENTE = "en attente";

	// constructeur

	public DemandeFormation(String dateDebut, String dateFin, String etatValidation) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.etatValidation = etatValidation;
	}

	public DemandeFormation(String dateDebut, String dateFin) {
		this(dateDebut, dateFin, DemandeFormation.ATTENTE);
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
		return "DemandeFormation [etatValidation=" + etatValidation + ", dateDebut=" + dateDebut + ", dateFin="
				+ dateFin + "]";
	}

}
