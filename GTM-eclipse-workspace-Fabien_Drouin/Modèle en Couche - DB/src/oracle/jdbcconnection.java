package oracle;


//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;

import modele.Customer;
import service.CustomerService;
import service.ServiceImplementation;
//import java.sql.*;


public class jdbcconnection {

//	private final String userName = "Fabien";
//	private final String password = "BOURNE";

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:think:@localhost:1521:xe","fabien","BOURNE");
			Statement st=con.createStatement();
			String sql="select * from Customer";
			ResultSet rs=st.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
				con.close();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		// Initialisations

		CustomerService cs = new ServiceImplementation();

		Customer c1 = null;
		Customer c2 = new Customer("Neil Amstrong");
		Customer c3 = new Customer("Rachid Taha");

		// Scenario
		cs.addCustomer(c1);
		cs.addCustomer(c2);
		cs.addCustomer(c3);

		System.out.println(cs.getAllCustomer());
	}

}
