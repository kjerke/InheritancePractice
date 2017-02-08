/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NonfictionExample2;

/**
 *
 * @author kevinjerke
 */
public class Start {
    public static void main(String []args){
    CokeCola c = new CokeCola();
        
        c.setDrinkType("soda");
        c.setFlavor("Cherry");
        c.setSodaType("Coke");
        
        
        
        c.getDrinkDetails();
    }
}
