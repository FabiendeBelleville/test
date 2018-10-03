package service;

import java.util.List;

import model.Client;
import model.Compte;
import model.Conseiller;

/**
 * 
 * @author Fabien & Madjid; L'interface Service contient les méthodes (vides)
 *         qui seront implémentées dans la classe ImplementationService. Les
 *         méthodes ne sont donc ici que des signatures.
 *
 */
public interface Service {

	public void creerClient(Client c);

	public Client consulterClient(int id);

	public List<Client> consulterListeClient();

	public void supprimerClient(int id);

	public void faireVirement(double montant, Compte compteDestinataire, Compte compteEmetteur);

	public void simulerCredit();

	public void faireAudit(Compte... qsdf);

	// Conseiller
	public void creerConseiller(Conseiller con);

	// Conseiller
	public List<Conseiller> consulterListeConseiller();

	// Attribuer Client à Conseiller
	public void attribuerClientAConseiller(Conseiller conseillerARemplir, Client clientAAttribuer);

}
