package model;

public abstract class PizzaTemplate {

	public final void makePizza() {
		preparePate();
		mettreLaSauceTaumate();
		ajouterIngredients();
		ajouterLeFromageChoisi();
		mettreAuFour();
	}

	// preparer la pâte TJS
	private void preparePate() {
		System.out.println("Je prépare la pâte");
	}

	// mettre la sauce tomate TJS
	private void mettreLaSauceTaumate() {
		System.out.println("Je mets la sauce tomate");
	}

	// ajouter des ingredients dessus ABSTRAIT
	abstract void ajouterIngredients();

	// choix fromage ABSTRAIT
	abstract void ajouterLeFromageChoisi();

	// faire cuire TJS
	private void mettreAuFour() {
		System.out.println("Je mets la pizza au four 5 minutes");
	}
}
