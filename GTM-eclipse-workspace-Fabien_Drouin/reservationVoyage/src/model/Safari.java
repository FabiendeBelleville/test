package model;

public class Safari extends DestinationVoyage implements Reservation {

	public Safari(String destination) {
		super(destination);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String setResa() {
		// TODO Auto-generated method stub
		return "Résa méthode pour Safari";
	}

	@Override
	public String toString() {
		return "Safari [setResa()=" + setResa() + ", getDestination()=" + getDestination() + "]";
	}

}
