package progfonctionnelle;

import java.util.Scanner;

public class FFF {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre qqch");
		boolean booleantest=scanner.hasNextInt();
		System.out.println("Vérifions si c'est du Int :");
		if (booleantest==true) {
			System.out.println(booleantest);
		}else {
			System.out.println(booleantest);
		}
		
		scanner.close();
		
	}

}
