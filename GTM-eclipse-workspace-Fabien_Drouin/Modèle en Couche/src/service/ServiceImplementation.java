package service;

import java.util.List;

import modele.Customer;
import persistance.CustomerDAO;
import persistance.MemoryCustomerDAO;

public class ServiceImplementation implements CustomerService {

	private CustomerDAO dao = new MemoryCustomerDAO();

	@Override
	public void addCustomer(Customer c) {
		if (c != null) {
			dao.save(c);
		}
	}

	@Override
	public Customer validatedCustomer(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Customer> getAllCustomer() {
		return dao.findAll();
	}

}
