package main;

import exception.MyBusinessException;
import model.Customer;
import persistence.CustomerDao;
import persistence.CustomerDaoImpl;

public class Main {

	public static void main(String[] args) throws MyBusinessException {
		Customer c  = new Customer("Bob", "Bill", 42);
		CustomerDao dao = new CustomerDaoImpl();
		dao.create(c);
		Customer c2 = dao.findById(2);
		c2.setFirstname("newFirstname");
		dao.update(c2);

	}

}
