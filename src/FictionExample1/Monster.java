/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FictionExample1;

import javax.swing.JOptionPane;

/**
 *
 * @author kevinjerke
 */
public class Monster extends ImaginaryAnimal {
    String monsterName;

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }
    
    
    
    public void getAnimalDetails() {
        System.out.println("Character Details: " + getAnimalType());
       // + "Name of Monster: " + getAnimalDetails()
    }
    
}
