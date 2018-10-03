package persistance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Client;

/**
 * 
 * @author Fabien et Madjid. La classe MemoryDAO permet d'enregistrer
 *         les objets Client en simulant la sauvegarde en base de donnée.
 *         Elle implémente les fonctions de l'interface DAOConseiller
 *
 */
public class MemoryDAO implements DAO {

	private static final Map<Integer, Client> DBClient = new HashMap<>();
	private int id = 0;

	@Override
	public void save(Client c) {
		c.setid(id); // Artifice pour simuler l'auto increment d'une DB. Ne fait pas tous les cas !
		DBClient.put(c.getid(), c);
		id++;
	}

	@Override
	public Client findById(int id) {
		return DBClient.get(id);
	}

	@Override
	public List<Client> findAll() {
		return new ArrayList<>(DBClient.values());
	}

	@Override
	public void update(Client c) {
	}

	@Override
	public void delete(int id) {
		DBClient.remove(id);
	}

}
