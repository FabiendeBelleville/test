package service;

import exception.MyBusinessException;
import model.Customer;

public interface CustomerService {
	
	public void ajouterCustomer(Customer c) throws MyBusinessException;
	

}
