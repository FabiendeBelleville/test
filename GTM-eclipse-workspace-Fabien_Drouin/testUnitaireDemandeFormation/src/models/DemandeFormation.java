package models;

public class DemandeFormation {
	public static final String REFUSE = "refus";
	public static final String ACCEPTE = "accepté";
	public static final String ATTENTE = "en attente";

	private String theme;
	private String etatValidation;

	public DemandeFormation(String theme) {
		etatValidation = ATTENTE;
		this.theme = theme;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getEtatValidation() {
		return etatValidation;
	}

	public void setEtatValidation(String etatValidation) {
		this.etatValidation = etatValidation;
	}

	@Override
	public String toString() {
		return "DemandeFormation [theme=" + theme + ", etatValidation=" + etatValidation + "]";
	}

}
