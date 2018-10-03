package persistance;

import java.util.List;

import model.Customer;

public interface CustomerDAO {

	// Créer en base
	public int create(Customer c);

	// Lire toute la base
	public List<Customer> findAll();

	// Chercher en base
	public Customer findById(int id);

	// Update Customer
	public int update(Customer c);
	
	// Supprimer un Customer
	public int delete(int id);
	
}
