package service;

import java.util.List;

import model.Client;
import model.Compte;
import model.CompteCourant;
import model.CompteEpargne;
import model.Conseiller;
import persistance.DAO;
import persistance.DAOConseiller;
import persistance.MemoryConseillerDAO;
import persistance.MemoryDAO;

/**
 * 
 * @author Fabien & Madjid; La classe ImplementationService implements Service.
 *         C'est la classe où les méthodes sont codées. Les DAO Client et
 *         Conseiller sont instanciées ici. A ce stade du développement de
 *         l'application, la méthode Audit reste inachevée.
 * 
 */
public class ImplementationService implements Service {
	private DAO dao = new MemoryDAO();
	private DAOConseiller daoConseiller = new MemoryConseillerDAO();

	@Override
	public void creerClient(Client c) {
		if (c != null) {
			new CompteCourant("jour de la création du monde", -9999999, -999, 1000000000);
			new CompteEpargne("jour de la création du monde", -9999999, -999, 1000000000);
			dao.save(c);
		}
	}

	@Override
	public Client consulterClient(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Client> consulterListeClient() {
		return dao.findAll();
	}

	@Override
	public void supprimerClient(int id) {
		dao.delete(id);
	}

	/**
	 * Le Service FaireVirement permet d'effectuer un virement. Il s'agit d'une
	 * méthode qui effectue les opérations et affiche les étapes du vrement
	 */

	@Override
	public void simulerCredit() {

	}

	@Override
	public void faireAudit(Compte...qsdf) {
		System.out.println("C'est parti pour l'audi !");
		for (Compte compte : qsdf) {
			compte.getSolde();
			System.out.println(compte.getSolde());
		}
		//if (Compte.getSolde()<-5000) {
			
		}
		//brouillon de méthode :
		// Pour chaque compte bancaire, getType
		// if particulier
		// getSold Particulier
		// if Solde<5000
		// alors syso Compte débityuer de + de 5000 euros
		// else (entreprise)
		// getSold Entreprise
		// if Solde<50000
		// alors syso Compte débityuer de + de 50000 euros
	

	@Override
	public void creerConseiller(Conseiller con) {
		if (con != null) {
			daoConseiller.saveConseiller(con);
		}
	}

	@Override
	public List<Conseiller> consulterListeConseiller() {
		return daoConseiller.findAllConseiller();
	}

	@Override
	public void attribuerClientAConseiller(Conseiller conseillerARemplir, Client clientAAttribuer) {

		if (conseillerARemplir.clientsAttribues.size() < 10) {
			conseillerARemplir.clientsAttribues.add(clientAAttribuer);
			System.out.println(clientAAttribuer + " ajouté !");
		} else {
			System.out.println(conseillerARemplir.getNom() + " est complet, choisir un autre conseiller");
		}

	}

	@Override
	public void faireVirement(double montant, Compte compteDestinataire, Compte compteEmetteur) {
		// Affichage opération à effectuer
		System.out.println("Le virement bancaire suivant va être effectué :");
		System.out.println("Le compte Emetteur est : " + compteEmetteur);
		System.out.println("Le compte Destinataire est : " + compteDestinataire);
		System.out.println("Le montant du virement est : " + montant);

		// opération
		if ((compteEmetteur.getSolde() - montant) < -compteEmetteur.getDecouvertAutorise()) {
			System.out.println("******************************************");
			System.out.println("REFFUSE : le virement n'a pas été effectué");
			System.out.println("******************************************");
			System.out.println("Cause : solde compte emetteur insuffisant");

		} else {
			compteDestinataire.setSolde(compteDestinataire.getSolde() + montant);
			compteEmetteur.setSolde(compteEmetteur.getSolde() - montant);

			// Affichage récapicé
			System.out.println("************************************");
			System.out.println("ACCEPTE : le virement a été effectué");
			System.out.println("************************************");
			System.out.println("à présent, le compte Destinataire est : " + compteDestinataire);
			System.out.println(compteDestinataire.getSolde());
			System.out.println("à présent, le compte Emetteur est : " + compteEmetteur);
		}
	}

}
