/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NonfictionExample3;

/**
 *
 * @author kevinjerke
 */
public class iPad extends Tablet{
    String generation;

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }
    
    
    public void getDeviceDetails(){
        System.out.println("Type of device: " + getTypeOfComputer() + "Screen Size: " + getScreenSize() 
                + "Generation of iPad: " + getGeneration());
    }
}
