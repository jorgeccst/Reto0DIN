/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcDinReto0Model;

import java.util.ResourceBundle;

public class ModelFactory {
    
    public static String getModel() {
 
        final String FILENAME = "mvcDinReto0Resources/Config";
	
	ResourceBundle model;    
        
        String option;
        
        model=ResourceBundle.getBundle(FILENAME);
        option = model.getString("modelType");
                
                
        return option;
        
     
 }
    
}
