package progfonctionnelle;

import java.util.Scanner;

public class PileOuFace {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int val = (int) (Math.random() * 2);
		System.out.println("Parier 0 ou 1 ?");
		int pari = scanner.nextInt();
		scanner.nextLine();
		if (pari == val) {
			System.out.println("bravo");
		} else if (val == 0) {
			System.out.println("face");
		} else {
			System.out.println("pile");
		}
		scanner.close();
	}

}
