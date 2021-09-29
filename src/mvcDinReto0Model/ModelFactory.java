/**
 *This package contains the interfaces and the DB implementations of the application.
 */
package mvcDinReto0Model;

import java.util.ResourceBundle;


/**
 *Model Factory class.
 * This Interfaces generates the method that is going to be used in the model implementations.
 * @author Jorge & Adrián.
 */
public class ModelFactory {
    
    public static Model getModel() {
 
        final String FILENAME = "mvcDinReto0Resources/Config";
	
	ResourceBundle model;    
        
        String option;
        
        model=ResourceBundle.getBundle(FILENAME);
        option = model.getString("modelType");
        
        Model modelInstance = null;
           
                           
          if(option.equalsIgnoreCase("file")){
                      
            Model fileImplementation =new FileModelImplementation();
              modelInstance=fileImplementation;
         
            
        }else if (option.equalsIgnoreCase("db")) {
                                  
             Model dbImplementation =new BDmodelImplementation();
            
            modelInstance=dbImplementation;
        }
               
        return modelInstance;
        
     
 }
    
}
