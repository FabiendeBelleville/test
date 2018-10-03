package model;

public class TransportLocalAlgerie extends DerouleVoyageTemplate {

	private String algerie = "Algérie";

	@Override
	void transportLocal() {
		System.out.println("Les voyageurs utilisent les transports locaux utilisés en " + algerie);
	}

}
