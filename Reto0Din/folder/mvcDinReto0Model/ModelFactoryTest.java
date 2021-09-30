/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcDinReto0Model;

import java.util.ResourceBundle;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adril_4v37cln
 */
public class ModelFactoryTest {
    
    public ModelFactoryTest() {
    }

    @Test
    public void testGetModelDB() {
        
        	
	ResourceBundle model;    
        
        String option;
        
        model=ResourceBundle.getBundle("mvcDinReto0Resources/config");
        option = model.getString("modelType");
               
        assertEquals(option,"db");
        
        
    }
    
     @Test
    public void testGetModelFile() {
        
        	
	ResourceBundle model;    
        
        String option;
        
        model=ResourceBundle.getBundle("mvcDinReto0Resources/config");
        option = model.getString("modelType");
               
        assertEquals(option,"file");
        
        
    }
    
}
