package model;

public class ChezLHabitant extends DestinationVoyage implements Reservation {

	public ChezLHabitant(String destination) {
		super(destination);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String setResa() {
		// TODO Auto-generated method stub
		return "Résa méthode pour un voyage chez l'habitant";
	}

	@Override
	public String toString() {
		return "ChezLHabitant [setResa()=" + setResa() + ", getDestination()=" + getDestination() + "]";
	}

}
