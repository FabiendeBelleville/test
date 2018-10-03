package org.formation.formation.model;

public class DemandeFormation {
	public static final String REFUS = "Refuse";
	public static final String ACCORDE = "Accorde";
	public static final String ATTENTE = "En attente";
		
	private String dateDebut;
	private String dateFin;
	private String etatValidation;

	public DemandeFormation(String dateDebut, String dateFin, String etatValidation) {
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.etatValidation = etatValidation;
	}

	public DemandeFormation(String dateDebut, String dateFin) {
		this(dateDebut, dateFin, ATTENTE);
	}
}
