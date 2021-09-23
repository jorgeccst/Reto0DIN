/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcDinReto0View;

import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class ViewFactory {
    
     public static View getView() {
 
         View view = null;
         
        final String FILENAME = "mvcDinReto0Resources/config";
	
	ResourceBundle viewType;
              
        String option;
        
        viewType=ResourceBundle.getBundle(FILENAME);
        option = viewType.getString("viewType");
                
           if(view instanceof JavaSwingImplementation){
               
               view= new JavaSwingImplementation();
               
           } else if(view instanceof TextViewImplementation){
               
               view = new TextViewImplementation();
           }    
               
        return view;
     
 }
    
    
    
}
