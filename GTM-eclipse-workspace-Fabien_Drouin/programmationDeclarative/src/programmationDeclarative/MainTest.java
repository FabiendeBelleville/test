package programmationDeclarative;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		System.out.println("Veuillez entrer le rayon du cercle !");
		Scanner scanner = new Scanner(System.in);
		double radius = scanner.nextDouble();
		
		double d = 2 * radius;

		double airecercle = Math.PI * d * d / 4;
//		System.out.println(Math.PI);
		System.out.println("La valeure entrée par tes soins est : " + radius);
		System.out.println("donc l'aire du cercle est égale à " + airecercle);
		
		System.out.println("Veuillez à présent entrer la hauteur du cylindre !!!");
		Scanner scanner2 = new Scanner(System.in);
		double hauteur = scanner2.nextDouble();
		System.out.println("Tu viens de dire que la hauteur du cylindre était de " + hauteur);
		double volumecylindre = hauteur*airecercle;
		System.out.println("Alors le volume du cylindre est égale à " + volumecylindre);
		scanner.close();
		scanner2.close();
	}

}
