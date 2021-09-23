/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcDinReto0Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adril_4v37cln
 */
public class FileModelImplementation implements Model{

    @Override
    public String getGreeting() {
       
       String greeting = null;
        
        File f = new File(getClass().getResource("Greeting").getFile());
       
        FileReader fr;
        try {
            fr = new FileReader (f);
            
              BufferedReader br = new BufferedReader(fr);
     
            String linea = br.readLine();
             greeting=linea;
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    
          return greeting ;
        
        
    }

}
