/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcDinReto0View;

/**
 *
 * @author 2dam
 */
public class JavaSwingImplementation implements View{

    JavaSwingImplementation() {
        
       
    }

    @Override
    public void showGreeting(String greeting) {
      SwingView sv=new SwingView(greeting);
        sv.setVisible(true);
    }
    
}
