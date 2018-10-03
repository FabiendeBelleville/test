package lanceur;

import model.CreditCardStrategy;
import model.Item;
import model.PayPalStrategy;
import model.ShoppingCart;
import model.paiementStrategy;

public class Main {

	public static void main(String[] args) {

		// Objets à vendre
		Item i1 = new Item(20000, "Table Ming en bois");

		// Moyens de paiement
		paiementStrategy p1 = new PayPalStrategy("sdfg@qsdfg.fr");
		paiementStrategy p2 = new CreditCardStrategy("Vincent Cassel", "XXXX XXXX XXXX XXXX");

		// Caddies
		ShoppingCart caddie1 = new ShoppingCart();
		caddie1.addItem(i1);

		caddie1.payment(p2);
	}
}
