/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NonfictionExample2;

import javax.swing.JOptionPane;

/**
 *
 * @author kevinjerke
 */
public class Beverages {
    String drinkType;
    
    public void setDrinkType(String drink){
        drinkType = drink;
    }
    
    public String getDrinkType(){
        return drinkType;
    }
    
    public void getDrinkDetails(){
        JOptionPane.showMessageDialog(null, "Drink type: " + getDrinkType());
      
    }
}
