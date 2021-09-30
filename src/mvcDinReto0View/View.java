/**
This package contains the different views that can be used.(javaFX,JavaSwing and command line).
 */
package mvcDinReto0View;

import javax.swing.JFrame;

/**
 * View interface class.
 * This Interfaces generates the method that is going to be used in the view implementations.
 * @author Jorge_Adrián.
 */
public interface View {
    /**
     * 
     * @param greeting = String variable where the greeting is stored.
     */
    public void showGreeting(String greeting);
   
}
