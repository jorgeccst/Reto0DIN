/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcDinReto0Controller;

import mvcDinReto0Model.BDmodelImplementation;
import mvcDinReto0Model.FileModelImplementation;
import mvcDinReto0Model.Model;

/**
 *
 * @author 2dam
 */
public class Controller {

     private String model;
     private String view;
     
    
    public Controller(String model, String view){
    
       this.model=model;
       this.view=view;
       
        getGreeting(model);
        
}
    private String getGreeting(String option) {
     
        option=model;
        
        String greeting = null;
        
        if(option.equalsIgnoreCase("file")){
                              
            System.out.println(option);
            
            Model fileImplementation =new FileModelImplementation();
            greeting=fileImplementation.getGreeting();
            
        }else if (option.equalsIgnoreCase("db")) {
            
             System.out.println(option);
            
             Model dbImplementation =new BDmodelImplementation();
             greeting=dbImplementation.getGreeting();
            
        }
              
        return greeting;
    }
    
    
}


