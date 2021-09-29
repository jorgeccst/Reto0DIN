/**
This package contains the interfaces and the DB implementations of the application.
 */
package mvcDinReto0Model;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorge & Adrián.
 */
public class BDConnection {
     private ResourceBundle configFile;
  
    private String conn;
    private String dbUser;
    private String dbPass;
    private String Driver;

    public BDConnection() {

        configFile = ResourceBundle.getBundle("mvcDinReto0Resources.config");

     
        conn = configFile.getString("Conn");
        dbUser = configFile.getString("DBUser");
        dbPass = configFile.getString("DBPass");
      Driver = configFile.getString("Driver");

    }

    public Connection openConnection() {

        Connection con = null;

        try {
            //String url = "jdbc:mysql://localhost/nombreBaseDatos";
            //con =  DriverManager.getConnection(url+"?" +"user=____&password=_____");
            Class.forName(Driver);
            con = DriverManager.getConnection(conn, dbUser, dbPass);
            
            
            
        } catch (SQLException e){
            
        } catch (ClassNotFoundException ex) {
             Logger.getLogger(BDConnection.class.getName()).log(Level.SEVERE, null, ex);
         }
        return con;
    }
    
    

    public void closeConnection(PreparedStatement stmt, Connection con) throws SQLException {

        if (stmt != null) {
            stmt.close();
        }
        if (con != null) {
            con.close();
        }

    }

}

