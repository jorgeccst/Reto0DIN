/**
 *This package contains the interfaces and the DB implementations of the application.
 */
package mvcDinReto0Model;

import java.util.ResourceBundle;


/**
 *Model Factory class.
 * This Interfaces generates the method that is going to be used in the model implementations.
 * @author Jorge_Adrián.
 */
public class ModelFactory {
    
    
    /**
     * This method returns an instance of the model interface reading the .properties file.
     * @return modelInstance = Model instance
     */
    
    public static Model getModel() {
 
       
	
	ResourceBundle model;    
        
        String option;
        
        model=ResourceBundle.getBundle("mvcDinReto0Resources/config");
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
