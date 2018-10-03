package persistance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import model.Customer;

class DaoCustomerTest {
	@Test
	void customerPersisted() {
		Customer c = new Customer("AULNETTE", "Brigitte", 99);
		CustomerDAO DAO = new CustomerDAOImpl();
		int resultat = DAO.create(c);
		assertEquals(1, resultat);
	}
}