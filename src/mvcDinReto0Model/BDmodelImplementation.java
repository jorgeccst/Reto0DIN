/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcDinReto0Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adril_4v37cln
 */
public class BDmodelImplementation implements Model {

    
     
	private Connection con;
	private PreparedStatement stmt;
	private BDConnection db = new BDConnection();

	private final String GETGREETING = "SELECT * FROM greeting";
    
    
    @Override
    public String getGreeting() {
       
      
     
                ResultSet rs = null;
		
                String greeting = null;
        
		con = db.openConnection();

		try {
                                     
			stmt = con.prepareStatement(GETGREETING);
		
			rs = stmt.executeQuery();

			if (rs.next()) {
			
                            greeting=rs.getString(1);
                            
			} else
				greeting=null;
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException ex) {
					
				}
			}
            try {
                db.closeConnection(stmt, con);
            } catch (SQLException ex) {
                Logger.getLogger(BDmodelImplementation.class.getName()).log(Level.SEVERE, null, ex);
            }
		}

		return greeting;
        
        
    }

    

}
   
