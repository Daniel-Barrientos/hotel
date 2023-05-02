package model.DAO;

import java.sql.*;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Conexion {

    private static Connection cnx = null;

    public static Connection obtener() throws ClassNotFoundException, SQLException {

        if (cnx == null) {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", " ");
        }

        return cnx;
    }

    public static void cerrar() throws SQLException {
        
        if (cnx != null) {
            cnx.close();
        }
    
    }

}
