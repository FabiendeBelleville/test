package model;

import java.util.ArrayList;

public class ShoppingCart {

	ArrayList<Item> items = new ArrayList<>();

	public void addItem(Item i) {
		items.add(i);
	}

	public void removeItem(Item i) {
		items.remove(i);
	}

	// méthode d'instance
	public double getTotal() {
		double somme = 0;
		for (Item item : items) {
			somme += item.getPrice();
		}
		return somme;
	}

	public void payment(paiementStrategy paymentMethode) {
		paymentMethode.payment(getTotal());
	}
}
