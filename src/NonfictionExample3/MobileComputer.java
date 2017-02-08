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
public class MobileComputer {
    String typeOfComputer;
    String numberOfCores;

    public String getTypeOfComputer() {
        return typeOfComputer;
    }

    public void setTypeOfComputer(String typeOfComputer) {
        this.typeOfComputer = typeOfComputer;
    }

    public String getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(String numberOfCores) {
        this.numberOfCores = numberOfCores;
    }
    
    
    public void getDeviceDetails(){
        System.out.println("Type of device: " + getTypeOfComputer());
    }
}
