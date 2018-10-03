package progfonctionnelle;

import java.util.ArrayList;
import java.util.List;

public class FonctFor {
	public static final String VILLE = "Paris";

	public static void main(String[] args) {
		System.out.println("");
		System.out.println("*********************");
		System.out.println("*******Etape 1*******");
		System.out.println("*********************");

		int[] nombres = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		for (int num : nombres) {
			System.out.println(num);

		}

		System.out.println("");
		System.out.println("*********************");
		System.out.println("*******Etape 2*******");
		System.out.println("*********************");
		int chiffres[] = { 2, 8, 7, 9, 4, 5, 1, 9, 8, 7 };
		for (int i = 0; i < chiffres.length; i++) {
			System.out.println(chiffres[i]);

		}

		System.out.println("");
		System.out.println("*********************");
		System.out.println("*******Etape 3*******");
		System.out.println("*********************");

		String[] tableaudevilles = { "Munich", null, "Machecoul", "Paris", "Amsterdam", "Athènes" };

		for (String tmp : tableaudevilles) {
			System.out.print(tmp);
			if (VILLE.equals(tmp)) {
				System.out.print(" : c'est ma ville préférée.");
			}
			System.out.println("");
		}

		System.out.println("");
		System.out.println("*********************");
		System.out.println("*******Etape 4*******");
		System.out.println("*********************");

		String[] listedevilles = new String[6];

		listedevilles[0] = "Munich";
		listedevilles[1] = null;
		listedevilles[2] = "Machecoul";
		listedevilles[3] = "Paris";
		listedevilles[4] = "Amsterdam";
		listedevilles[5] = "Athènes";

		for (int i = 0; i < listedevilles.length; i++) {
			System.out.print(listedevilles[i]);
			if (VILLE.equals(listedevilles[i])) {
				System.out.print(" : c'est ma ville préférée.");
			}
			System.out.println("");

		}

		System.out.println("");
		System.out.println("*********************");
		System.out.println("*******Etape 5*******");
		System.out.println("*********************");

		List<String> veritablelistedevilles = new ArrayList<>();

		veritablelistedevilles.add("Munich");
		veritablelistedevilles.add(null);
		veritablelistedevilles.add("Machecoul");
		veritablelistedevilles.add("Paris");
		veritablelistedevilles.add("Amsterdam");
		veritablelistedevilles.add("Athènes");

		for (int i = 0; i < veritablelistedevilles.size(); i++)
		{
			System.out.println(veritablelistedevilles.get(i));	
		}

		System.out.println("");
		System.out.println("*********************");
		System.out.println("*******Etape 6*******");
		System.out.println("*********************");
		
		
		for (String tmp : veritablelistedevilles) {
			System.out.print(tmp);
			if (VILLE.equals(tmp)) {
				System.out.print(" : c'est ma ville préférée.");
			}
			System.out.println("");
		}
	}
}
