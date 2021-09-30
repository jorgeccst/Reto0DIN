/**
* This package contains the interfaces and the DB implementations of the application.
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
 * File model implementation
 * This class implements the model interface in order to get the greeting with a file implemementation method.
 * 
 * @author Jorge_Adrián.
 */
public class FileModelImplementation implements Model{

    
    /**
     * This method obtain and reads the file while it has lines.
     * @return Greeting= String variable that stores the greeting.
     */
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
