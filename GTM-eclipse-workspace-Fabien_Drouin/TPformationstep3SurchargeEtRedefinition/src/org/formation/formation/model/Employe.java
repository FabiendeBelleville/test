package org.formation.formation.model;

public class Employe {
	private int id;
	private String nom;
	private String prenom;
	
	public Employe(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	public void demanderFormation(String debut, String fin){
		System.out.println("L'employe "+prenom+" "+nom+" demande une formation du "+debut+" au "+fin);
	}

	@Override
	public String toString() {
		return "Employe : "+id+", "+prenom+" "+nom;
	}
	
	
}
