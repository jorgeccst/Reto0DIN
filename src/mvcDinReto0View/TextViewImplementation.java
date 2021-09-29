/**
This package contains the different views that can be used.(javaFX,JavaSwing and command line).
 */
package mvcDinReto0View;

import javax.swing.JFrame;
import mvcDinReto0View.View;

/**
 *
 * @author 2dam
 */
public class TextViewImplementation implements View{


    @Override
    public void showGreeting(String greeting) {
       
        System.out.println(greeting);
                
       
    }
  
    
}
