/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FictionExample1;

/**
 *
 * @author kevinjerke
 */
public class BigFoot extends Monster{
    String spottings;

    public String getSpottings() {
        return spottings;
    }

    public void setSpottings(String spottings) {
        this.spottings = spottings;
    }
    
    
    
    public void getAnimalDetails() {
        System.out.println("Character Details: " + getSpottings());
    }
}
