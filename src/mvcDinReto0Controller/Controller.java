/**
 This package contains the classes that manage all the methods of the application.
 */
package mvcDinReto0Controller;

import mvcDinReto0Model.BDmodelImplementation;
import mvcDinReto0Model.FileModelImplementation;
import mvcDinReto0Model.Model;
import mvcDinReto0View.View;

/**
 *
 * @author 2dam
 */
public class Controller {

    
    public void run(Model model, View view) {
        
          showGreeting(view, getGreeting(model)); 
        
    }


    private String getGreeting(Model model) {
     
        String greeting = null;

        
        greeting=model.getGreeting();
                 
        return greeting;
    }
    
    private void showGreeting(View view,String greeting){
               
        view.showGreeting(greeting);
        
    }
    
    
    
    
}


