package programmationDeclarative;

import java.util.Scanner;

public class ConversationMachine {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int nombre = 1;

		while (nombre == 1) {

			System.out.println("Eh, ça tourne!!!");
			System.out.println("Continuer ? 1 pour oui, 2 pour non !");
			nombre = scanner.nextInt();

		}
		nombre = 1;
		while (nombre == 1) {

			System.out.println("Pourquoi tu ne veux pas continuer ?!!!");

			nombre = scanner.nextInt();

		}
		System.out.println("Au revoir!");
		scanner.close();
	}

}
