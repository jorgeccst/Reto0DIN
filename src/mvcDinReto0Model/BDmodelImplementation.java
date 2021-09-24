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

/**
 *
 * @author adril_4v37cln
 */
public class BDmodelImplementation implements Model {

    private Connection con;
    private PreparedStatement stmt;
    private BDConnection db = new BDConnection();
    private final String getGreet = "select * from greeting";

    @Override
    public String getGreeting() {
        ResultSet rs = null;
        String result = null;
        con = db.openConnection();

        try {
            stmt = con.prepareStatement(getGreet);
            rs = stmt.executeQuery();
            if (rs.next()) {
                result = rs.getString(1);
            } else {
                result = null;
            }
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
            } catch (SQLException e) {

                e.printStackTrace();
            }
        }

        return result;
    }

}
