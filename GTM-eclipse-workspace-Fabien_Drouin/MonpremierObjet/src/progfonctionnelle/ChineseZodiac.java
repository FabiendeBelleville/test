package progfonctionnelle;

import java.util.Scanner;


public class ChineseZodiac {
	public static void main(String[] args) {
		//int i=1;
		//while(i !=0) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("");
		System.out.println("Entre ton année de naissance (aaaa)");
		boolean test = scanner.hasNextInt();

		if (test == true) {
			Integer annee = 0;
			annee = scanner.nextInt();
			scanner.nextLine();

			System.out.println("l'année entrée est " + annee);
			int signe = annee % 12;

			switch (signe) {
			case 0:
				System.out.println("Ton signe astrologique chinois est : monkey");
				break;
			case 1:
				System.out.println("Ton signe astrologique chinois est : rooster");
				break;
			case 2:
				System.out.println("Ton signe astrologique chinois est : dog");
				break;
			case 3:
				System.out.println("Ton signe astrologique chinois est : pig");
				break;
			case 4:
				System.out.println("Ton signe astrologique chinois est : rat");
				break;
			case 5:
				System.out.println("Ton signe astrologique chinois est : ox");
				break;
			case 6:
				System.out.println("Ton signe astrologique chinois est : tiger");
				break;
			case 7:
				System.out.println("Ton signe astrologique chinois est : rabbit");
				break;
			case 8:
				System.out.println("Ton signe astrologique chinois est : dragon");
				break;
			case 9:
				System.out.println("Ton signe astrologique chinois est : snake");
				break;
			case 10:
				System.out.println("Ton signe astrologique chinois est : horse");
				break;
			case 11:
				System.out.println("Ton signe astrologique chinois est : sheep");
				break;
			default:
				System.out.println("Mauvaise entrée");
			}

		} else {
			System.out.println("On avait dit une année.");

		//}

		scanner.close();
	}
}
}