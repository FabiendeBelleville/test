package org.formation.formation.model;

public class Manager extends Employe{

	public Manager(int id, String nom, String prenom) {
		super(id, nom, prenom);
	}
	
	public Manager(String nom, String prenom){
		this(0,nom, prenom);
	}
	
	public Manager(){
		this(0, "Gates", "Bill");
	}
	
	public void validerFormation() {
		System.out.println("Le Manager "+getPrenom()+" "+getNom()+" valide les formations");
	}


	@Override
	public void demanderFormation(String debut, String fin) {
		super.demanderFormation(debut, fin);
		System.out.println("Le Manager valide ses propres formations");
	}
	
	
	
}
