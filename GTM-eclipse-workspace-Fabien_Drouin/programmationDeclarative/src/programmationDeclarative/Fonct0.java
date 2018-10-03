package programmationDeclarative;

import java.util.Scanner;

public class Fonct0 {

	public static void main(String[] args) {

		int x = 1;
		int y = 2;
		int somme = x + y;
		int difference = x - y;
		int produit = x * y;
		int quotient = x / y;
		int reste = x % y;
		System.out.println("x " + x);
		System.out.println("y " + y);
		System.out.println("somme " + somme);
		System.out.println("difference " + difference);
		System.out.println("produit " + produit);
		System.out.println("quotient " + quotient);
		System.out.println("reste " + reste);

		System.out.println("**********");
		System.out.println("**DOUBLE**");
		System.out.println("**********");

		double xd = x;
		double yd = y;
		double sommed = xd + yd;
		double differenced = xd - yd;
		double produitd = xd * yd;
		double quotientd = xd / yd;
		double rested = xd % yd;
		System.out.println("x " + xd);
		System.out.println("y " + yd);
		System.out.println("somme " + sommed);
		System.out.println("difference " + differenced);
		System.out.println("produit " + produitd);
		System.out.println("quotient " + quotientd);
		System.out.println("reste " + rested);

		// PARTIE 2

		System.out.println("************");
		System.out.println("**PARTIE 2**");
		System.out.println("************");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Donner un chiffre entre 0 et mille exclu");
		int nombre = scanner.nextInt();
		if (nombre < 0 || nombre > 999) {
			System.out.println("La valeure entrée par tes soins est : " + nombre);
			System.out.println("Cette valeure est incorrecte");
		} else {

			System.out.println("La valeure entrée par tes soins est : " + nombre);

			int a1erdigit = nombre % 10;
			int a2premiersdigits = nombre / 10;
			int a2emedigit = a2premiersdigits % 10;
			int intermediaire = a2premiersdigits / 10;
			int a3emedigit = intermediaire % 10;
			int sommepartie2 = a1erdigit + a2emedigit + a3emedigit;

			System.out.println("Le 1er digit est : " + a1erdigit);

			System.out.println("Le 2eme digit est : " + a2emedigit);

			System.out.println("Le 3eme digit est : " + a3emedigit);

			System.out.println("La somme de tous les digits de " + nombre + " est " + sommepartie2);
			scanner.close();
		}

	}

}
