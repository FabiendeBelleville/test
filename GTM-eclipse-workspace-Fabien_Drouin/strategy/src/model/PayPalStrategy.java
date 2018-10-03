package model;

public class PayPalStrategy implements paiementStrategy {

	private String email;

	// constructeur
	public PayPalStrategy(String email) {
		super();
		this.email = email;
	}

	@Override
	public void payment(double amount) {
		System.out.println("Je paie avec mon compte Paypal (" + email + ") le montant suivant " + amount + " €");
	}

}
