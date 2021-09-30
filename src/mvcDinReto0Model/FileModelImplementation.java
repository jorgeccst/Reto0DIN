/**
* This package contains the interfaces and the DB implementations of the application.
*/
package mvcDinReto0Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ResourceBundle;
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
       
        
	ResourceBundle model;    
        
        String greeting;
        
       model=ResourceBundle.getBundle("mvcDinReto0Resources/config");
        greeting = model.getString("greeting");
        
          return greeting ;
        
        
    }

}
