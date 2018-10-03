package presentation;

import java.util.Scanner;

import model.Agence;
import model.Client;
import model.CompteCourant;
import model.CompteEpargne;
import model.Conseiller;
import model.Gerant;
import service.ImplementationService;
import service.Service;

/**
 * 
 * @author Fabien & Madjid; A ce stade du développement de l'application, la
 *         classe Presentation contenant une méthode main nous permet de lancer
 *         le programme. En intéragissant avec l'utilisateur, les données
 *         initiales sont saisie, les objets sont instanciés, les méthodes sont
 *         appelées.
 *
 */
//public class Presentation {
//	public static void main(String[] args) {
//
//		String tmp;
//
//		System.out.println("Bonjour,");
//		System.out.println("Le programme ProxiBanqueSI se lance");
//
//		System.out.println("Veuillez entrer le nom du Gerant de l'agence");
//		Scanner scanner = new Scanner(System.in);
//		tmp = scanner.nextLine();
//
//		// Initialisations
//		Gerant g1 = new Gerant(tmp, "David", "545k4");
//		System.out.println("Vous avez créé le " + g1);
//
//		Agence a1 = new Agence(g1.idAgence, "01 janvier 1974", g1.getNom());
//		System.out.println("Vous êtes dans l'" + a1);
//
//		Service s1 = new ImplementationService();
//
//		System.out.println("Veuillez créer un nouveau client");
//		System.out.println("Veuillez entrer son nom");
//		String tmp1 = scanner.nextLine();
//		System.out.println("Veuillez entrer son prénom");
//		String tmp2 = scanner.nextLine();
//		System.out.println("Veuillez entrer son adresse");
//		String tmp3 = scanner.nextLine();
//		System.out.println("Veuillez entrer son CP");
//		int tmp4 = scanner.nextInt();
//		scanner.nextLine();
//		System.out.println("Veuillez entrer sa Ville");
//		String tmp5 = scanner.nextLine();
//		System.out.println(
//				"Afin d'associer un compte courant et un compte épargne à ce nouveau client, nous avons encore besoin de quelques informations");
//		System.out.println("Veuillez entrer la date du Jour");
//		String tmp6 = scanner.nextLine();
//		System.out.println("Veuillez entrer le montant du 1er dépot clent pour la création du compte courant");
//		double tmp7 = scanner.nextDouble();
//		scanner.nextLine();
//		System.out.println("Pour info, le montant du découvert autorisé est de 1000");
//
//		System.out.println("Veuillez entrer le montant du 1er dépot clent pour la création du compte épargne");
//		double tmp8 = scanner.nextDouble();
//		scanner.nextLine();
//
//		// Création client
//		CompteCourant courant = new CompteCourant(tmp6, tmp7, (int) Math.round(Math.random() * 1000000), 1000);
//		CompteEpargne epargne = new CompteEpargne(tmp6, tmp8, (int) Math.round(Math.random() * 1000000), 0);
//		Client c4 = new Client(tmp1, tmp2, tmp3, tmp4, tmp5, 000000000, courant, epargne);
//
//		// s1 est l'instance Service qui met le client dans dao
//		s1.creerClient(c4);
//
//		// Création d'un conseiller
//		Conseiller con0 = new Conseiller();
//		s1.creerConseiller(con0);
//
//		// attribution d'un client à un conseiller
//		s1.attribuerClientAConseiller(con0, c4);
//
//		System.out.println("Le conseiller qui a été automatiquement affecté au client est :");
//		System.out.println(con0);
//		System.out.println("************************************************************");
//		System.out.println("Voici la liste exhaustive des clients de l'agence");
//		System.out.println(s1.consulterListeClient());
//		System.out.println("************************************************************");
//		System.out.println("Voici la liste exhaustive des conseillers de l'agence");
//		System.out.println(s1.consulterListeConseiller());
//		System.out.println("************************************************************");
//
//		// Updater un Client
////		System.out.println(c4);
////		c4.setNom("BARBIE");
////		System.out.println(c4);
//
//		System.out.println("************************************************************");
//
//		System.out.println("Voulez-vous effectuer un virement ? OUI/NON");
//		String reponse = scanner.nextLine();
//		if (reponse.equals("OUI")) {
//
//			// faire des virements
//			System.out.println("Veuillez entrer le montant du virement");
//			double tmp9 = scanner.nextDouble();
//			scanner.nextLine();
//
//			System.out.println("Veuillez entrer le compte émetteur (courant ou epargne)");
//			String emetteur = scanner.nextLine();
//
//			if (emetteur.equals("epargne")) {
//				ImplementationService virement1 = new ImplementationService();
//				virement1.faireVirement(tmp9, courant, epargne);
//			} else if (emetteur.equals("courant")) {
//				ImplementationService virement1 = new ImplementationService();
//				virement1.faireVirement(tmp9, epargne, courant);
//			} else {
//				System.out.println("Erreur de saisie");
//			}
//			System.out.println("Fin virement");
//
//			// faire un audit
//			ImplementationService audit1 = new ImplementationService();
//			audit1.faireAudit();
//
//		}
//		System.out.println("Veuillez relancer l'application");
//
//		scanner.close();
//	}
//
//}
