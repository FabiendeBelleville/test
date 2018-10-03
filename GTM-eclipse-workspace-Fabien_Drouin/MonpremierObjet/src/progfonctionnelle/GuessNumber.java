package progfonctionnelle;

import java.util.Scanner;

/**
 * @author Fabien Drouin
 *  *
 */

public class GuessNumber {
	public static void main(String[] args) {
		int i = 0;
		int pari = -1;

		Scanner scanner = new Scanner(System.in);
		int nombrealeatoire = (int) (Math.random() * 10);

		do {
			i++;

			System.out.println("Parier entre 0 et 9");
			pari = scanner.nextInt();
			scanner.nextLine();

			if (nombrealeatoire == pari) {
				System.out.println("Bravo, vous avez trouvé en " + i + " essai(s)");
				i = -1;
			} else if (nombrealeatoire > pari) {
				System.out.println("C'est plus, essai encore");
			} else {
				System.out.println("C'est moins, essai encore");
			}
		} while (pari != nombrealeatoire);
		System.out.println("Fin");

		scanner.close();
	}
}
