/**
This package contains the different views that can be used.(javaFX,JavaSwing and command line).
 */
package mvcDinReto0View;

import javax.swing.JFrame;
import mvcDinReto0View.View;

/**
 *
 * @author Jorge & Adrián.
 */
public class TextViewImplementation implements View{

    /**
     * This method receives the greeting and prints it on the command line
     * @param greeting =String variable that stores the greeting
     */
    
    @Override
    public void showGreeting(String greeting) {
       
        System.out.println(greeting);
                
       
    }
  
    
}
