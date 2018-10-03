package model;

public class Reine extends PizzaTemplate {

	private String Reine = "Reine";

	@Override
	public void ajouterIngredients() {
		System.out.println("J'ajoute les ingrédients spécifiques à la " + Reine);
	}

	@Override
	public void ajouterLeFromageChoisi() {
		System.out.println("J'ajoute le Fromage spécifique à la " + Reine);

	}

}