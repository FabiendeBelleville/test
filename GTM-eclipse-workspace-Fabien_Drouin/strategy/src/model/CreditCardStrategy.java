package model;

public class CreditCardStrategy implements paiementStrategy {

	private String name;
	private String number;

	// constructeur
	public CreditCardStrategy(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}

	@Override
	public void payment(double amount) {
		System.out.println("Je paie avec ma CB (" + name + ") le montant suivant " + amount + " €");
	}
}