package service;

import java.util.List;

import modele.Customer;

public interface CustomerService {

	public void addCustomer(Customer c);

	public Customer validatedCustomer(int id);

	public List<Customer> getAllCustomer();
}
