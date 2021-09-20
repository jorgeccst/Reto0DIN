/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcDinReto0Model;

/**
 *
 * @author 2dam
 */
public class ModelFactory {
    
    public static  getFactura(String tipo) {
 
 if (tipo.equals("iva")) {
 
 return new FacturaIva();
 }
 else {
 return new FacturaIvaReducido();
 }
 
 }
    
}
