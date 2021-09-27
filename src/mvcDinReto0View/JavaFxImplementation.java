/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcDinReto0View;

import javafx.stage.Stage;

/**
 *
 * @author 2dam
 */
public class JavaFxImplementation implements View{

    
    @Override
    public void showGreeting(String greeting) {
        FXView fx=new FXView(greeting);
      
       
    }
    
}
