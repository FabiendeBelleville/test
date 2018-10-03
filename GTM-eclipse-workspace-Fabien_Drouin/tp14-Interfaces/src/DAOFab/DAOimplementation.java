package DAOFab;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOimplementation {

	public static void sauverEnDB(int i, double width, double height, double surface) {
		Connection cn = null;
		PreparedStatement pst = null;
		try {
			cn = JDBCUtil.seConnecter();
			// étape 3 : création d'un prepared statement
			String sql = "INSERT INTO SURFACE (p, width, height, surface) VALUES(?,?,?,?)";
			pst = cn.prepareStatement(sql);
			pst.setInt(1, i);
			pst.setDouble(2, width);
			pst.setDouble(3, height);
			pst.setDouble(4, surface);
			// étape 4 : exécution requête
			pst.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.seDeconnecter(pst, null, cn);
		}
	}
}