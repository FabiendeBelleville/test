package demojdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DemoJdbcPreparedStatement {

	public static void main(String[] args) {

		sauverEnBasePreparedStatement("Nicolas Jaar");
		lireEnBasePreparedStatement();

	}
	public static void sauverEnBasePreparedStatement(String personne) {
		Connection cn = null;
		PreparedStatement pst = null;
		try {
			cn = utile.JDBCUtil.seConnecter();
			// étape 3 : création d'un statement
			String sql = "INSERT INTO CLIENT (nom) VALUES(?)";
			pst = cn.prepareStatement(sql);
			pst.setString(1, personne);
			// étape 4 : exécution requête
			pst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			utile.JDBCUtil.seDeconnecter(pst, null, cn);
		}
	}

	public static void lireEnBasePreparedStatement() {
		Connection cn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			cn = utile.JDBCUtil.seConnecter();
			// étape 3 : création d'un statement
			String sql = "SELECT id, Nom FROM client where id >?";
			pst = cn.prepareStatement(sql);
			pst.setInt(1, 0);
			// étape 4 exécution d'une requête
			rs = pst.executeQuery();
			// étape 5 parcours ResultSet
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("Nom"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			utile.JDBCUtil.seDeconnecter(pst, null, cn);
		}
	}
}
