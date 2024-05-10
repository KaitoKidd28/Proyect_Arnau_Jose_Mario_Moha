package planetwars;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleJavaJDBC {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		String DB_URL = "jdbc:oracle:thin:@http://localhost:1521:orcl";
		String USER = "system";
		String PASS = "admin";
		
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			if (conn != null) {
				System.out.println("Connected to the Oracle DB!");
				stmt = conn.createStatement();
			} else {
				System.out.println("Failed to make connection!");
			}
		
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			stmt.close();
			conn.close();
		}
	}
}
