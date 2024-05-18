package planetwars;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleJavaJDBC {
	public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
        String USER = "sys as sysdba";
        String PASS = "P@ssw0rd";
        // Creating Connection
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            if (conn != null) {
                System.out.println("Connected to the Oracle DB!");
                // Crear el Statement después de haber establecido la conexión
                stmt = conn.createStatement();
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Intentar cerrar el Statement y la conexión en el bloque finally
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
