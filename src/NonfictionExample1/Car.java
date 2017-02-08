/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NonfictionExample1;

/**
 *
 * @author kevinjerke
 */
public class Car extends Automobile{
    String numberOfDoors;

    public String getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(String numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    
     public void getVehicleDetails(){
        System.out.println("Brand: " + getBrandName() + "Number of doors: " + getNumberOfDoors());
    }
}
