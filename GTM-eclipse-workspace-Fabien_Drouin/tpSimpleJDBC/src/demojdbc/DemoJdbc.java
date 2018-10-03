package demojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoJdbc {

	public static void main(String[] args) {
		sauverEnBase("Carlos");
		lireEnBase();
	}

	public static void sauverEnBase(String personne) {
		// Information d'accès à la base de données
		String url = "jdbc:mysql://localhost/formation";
		String login = "root";
		String password = "";
		Connection cn = null;
		Statement st = null;
		try {
			// étape 1 : chargement du driver
			Class.forName("com.mysql.jdbc.Driver");
			// étape 2 : récupération de la connexion
			cn = DriverManager.getConnection(url, login, password);
			// étape 3 : création d'un statement
			st = cn.createStatement();
			String sql = "INSERT INTO javadb (personne) VALUES ('" + personne + "')";
			// étape 4 : exécution requête
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				// Etape 5 : libétrer la mémoire
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void lireEnBase() {

		// Information d'accès à la base de données
		String url = "jdbc:mysql://localhost/formation";
		String login = "root";
		String password = "";
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			// étape 1 : chargement du driver
			Class.forName("com.mysql.jdbc.Driver");
			// étape 2 : récupération de la connexion
			cn = DriverManager.getConnection(url, login, password);
			// étape 3 : création d'un statement
			st = cn.createStatement();
			String sql = "SELECT * FROM javadb";
			// étape 4 exécution d'une requête
			rs = st.executeQuery(sql);
			// étape 5 parcours ResultSet
			while (rs.next()) {
				System.out.println(rs.getString("personne"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				// Etape 6 : libétrer la mémoire

				if (rs != null)
					rs.close();
				if (st != null)
					st.close();
				if (cn != null)
					cn.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
