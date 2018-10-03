package progfonctionnelle;

import java.util.Scanner;

public class PileOuFace2 {
	public static void main(String[] args) {
		System.out.println("");
		System.out.println("Ehhhh, ça fait longtps !! On va faire un pari ! On va tirer au sort 0 ou 1");
		System.out.println("Alors gros, Tu pari 0 ou 1 ??");
		int pari = 2;
		Scanner scanner = new Scanner(System.in);
		pari = scanner.nextInt();
		scanner.close();

		if (pari == 0 || pari == 1) {

			System.out.println("Tu as parié " + pari + " !! T'es vraiment obèse ! Voyons le résultat...");
			int resultat = (int) (Math.random() * 2);
			System.out.println("... le résultat est " + resultat + " !!");

			if (resultat == pari) {
				System.out.println("T'es verni gros ! T'es cocu même ! Tu as gagné !");
			} else {
				System.out.println("Pas de chance, mauvais choix, c'est la gigne ! Tu as perdu ton pari");
			}
			System.out.println("Adieu");
		} else {
			System.out.println("Tu n'as pas joué le jeu, je t'avais dit 0 ou 1 !!! J'arrête là. Adieu");
		}

	}

}
