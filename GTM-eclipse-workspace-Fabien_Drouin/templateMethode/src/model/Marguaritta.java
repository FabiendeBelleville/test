package model;

public class Marguaritta extends PizzaTemplate {

	private String Marguaritta = "Marguaritta";

	@Override
	public void ajouterIngredients() {
		System.out.println("J'ajoute les ingrédients spécifiques à la " + Marguaritta);
	}

	@Override
	public void ajouterLeFromageChoisi() {
		System.out.println("J'ajoute le Fromage spécifique à la " + Marguaritta);

	}

}
