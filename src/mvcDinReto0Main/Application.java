/**
 This package contains the main class of the application.
 */
package mvcDinReto0Main;

import mvcDinReto0Controller.Controller;
import mvcDinReto0Model.ModelFactory;
import mvcDinReto0View.ViewFactory;

/**
 *
 * @author 2dam
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * 
         */
        Controller controller = new Controller();
       
        controller.run(ModelFactory.getModel(), ViewFactory.getView());
        
        
                    
        
        
       
        
       
      
        
        
    }
    
}
