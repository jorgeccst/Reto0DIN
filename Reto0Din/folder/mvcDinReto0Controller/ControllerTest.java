/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcDinReto0Controller;

import mvcDinReto0Model.Model;
import mvcDinReto0Model.ModelFactory;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adril_4v37cln
 */
public class ControllerTest {
    
    public ControllerTest() {
           
    }

    @Test
    public void getGreetingDB() {
        
         Model model =ModelFactory.getModel();
        
         String greeting = model.getGreeting();
         
    
        assertEquals(greeting,"Hello world!!!");
       
    }
    
     @Test
    public void getGreetingFile() {
        
         Model model =ModelFactory.getModel();
        
         String greeting = model.getGreeting();
  
        assertEquals(greeting,"Hello world!");
       
    }
    
    
}
