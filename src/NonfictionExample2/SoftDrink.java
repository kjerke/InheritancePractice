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
public class SoftDrink extends Beverages {
    String flavorType;
    String sodaType;
    String drinkType;
    
    public void setFlavor(String flavor){
        flavorType = flavor;
    }
    
    public String getFlavor(){
        return flavorType;
    }
    
    public void setSodaType(String soda){
        sodaType = soda;
    }
    
    public String getSodaType(){
        return sodaType;
    }
    
    
    public void setDrinkType(String drink){
        drinkType = drink;
    }
    
    public void setDrinkType(){
        drinkType = "Soda";
    }
    
    
    public String getDrinkType(){
        return drinkType;
    }
    
    
    public void getDrinkDetails(){
        JOptionPane.showMessageDialog(null, "Drink type: " + getDrinkType() + " flavor: " + getFlavor() + " soda: " + getSodaType());
    }
}
