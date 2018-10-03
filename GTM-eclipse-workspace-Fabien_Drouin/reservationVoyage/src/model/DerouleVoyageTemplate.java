package model;

public abstract class DerouleVoyageTemplate {

	public final void derouleVoyage() {
		transportAvion();
		transportLocal();
		hebergementHotel();

	}

	// Transport en avion
	private void transportAvion() {
		System.out.println("Transport en avion");
	}

	// Liaison aéroport-hotel en transport local
	abstract void transportLocal();

	// Hebergement à l'hôtel
	private void hebergementHotel() {
		System.out.println("Hebergement à l'hôtel");
	}

}
