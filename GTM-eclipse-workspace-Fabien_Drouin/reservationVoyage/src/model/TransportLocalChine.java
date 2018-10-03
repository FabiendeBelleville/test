package model;

public class TransportLocalChine extends DerouleVoyageTemplate {

	private String chine = "Chine";

	@Override
	void transportLocal() {
		System.out.println("Les voyageurs utilisent les transports locaux utilisés en " + chine);
	}

}
