package test;

import model.CircleCustomEx;
import model.InvalidRadiusException;

public class MainTestCustomEx {

	public static void main(String[] args) throws InvalidRadiusException {
		try {
			CircleCustomEx cercle1 = new CircleCustomEx(-10);
			System.out.println("try : le rayon est : " + cercle1.getRadius());
		} catch (InvalidRadiusException e) {
			e.printStackTrace();
			System.out.println("catch : le try a échoué !");
			System.out.println(
					"le problème en cause est un rayon de " + e.getRadius() + " !!! Pas de rayon negatif mon gars");
		} finally {
			System.out.println("finally : fini");
		}
	}
}