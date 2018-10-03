package persistence;

import exception.MyBusinessException;
import model.Customer;

public interface CustomerDao {
	Customer findById(int id) throws MyBusinessException;

	int create(Customer c) throws MyBusinessException;

	int update(Customer c) throws MyBusinessException;

	int delete(Customer c) throws MyBusinessException;

}
