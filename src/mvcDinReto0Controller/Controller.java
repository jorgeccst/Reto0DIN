/**
 This package contains the classes that manage all the methods of the application.
 */
package mvcDinReto0Controller;

import mvcDinReto0Model.BDmodelImplementation;
import mvcDinReto0Model.FileModelImplementation;
import mvcDinReto0Model.Model;
import mvcDinReto0View.View;

/**
 * This class receives the greeting and shows it on screen, all of this thanks to the factories that return different instances.  
 * @author Jorge_Adrián.
 */
public class Controller {

    /**
     * This method sends the view instance and the data as a string to showGreeting method.
     * @param model = model instance received from  the model factory.
     * @param view  = view instance received from the view factory.
     */
    public void run(Model model, View view) {
        
          showGreeting(view, getGreeting(model)); 
        
    }

    /**
     * Method that receives the model instance and uses its methods to get the greeting and store it on a String.
     * @param model = model instance received from  the model factory.
     * @return greeting = String value received from the getGreeting method of the model.
     */    
    private String getGreeting(Model model) {
     
        String greeting = null;

        
        greeting=model.getGreeting();
                 
        return greeting;
    }
    
    /**
     * This method uses the showGreeting method and sends the greeting,then shows the greeting in different outputs . Depending on the instance of the view.
     * @param view =  view instance received from the view factory.
     * @param greeting = String value received from the getGreeting method of the model.
     */
    
    private void showGreeting(View view,String greeting){
               
        view.showGreeting(greeting);
        
    }
    
    
    
    
}


