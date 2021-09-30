/**
This package contains the different views that can be used.(javaFX,JavaSwing and command line).
 */
package mvcDinReto0View;

import java.util.ResourceBundle;

/**
 * View interface instance generator class.
 *This class generates an instance of the view Interface.
 * @author Jorge_Adrián.
 */
public class ViewFactory {
    /**
     * This method returns an instance of the view interface by reading the .Properties file.
     * @return View = an instance of the view interface
     */
     public static View getView() {
 
         View view = null;
         
        final String FILENAME = "mvcDinReto0Resources/config";
	
	ResourceBundle viewType;
              
        String option;
        
        viewType=ResourceBundle.getBundle(FILENAME);
        option = viewType.getString("viewType");
                
           if(option.equalsIgnoreCase("swing")){
               
               view= new JavaSwingImplementation();
               
           } else if(option.equalsIgnoreCase("text")){               
               view = new TextViewImplementation();
           } else if (option.equalsIgnoreCase("javafx"))   {
                view = new JavaFxImplementation();
                
           }
               
        return view;
     
 }
    
    
    
}
