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
public class ImaginaryAnimal {
    String nameOfAnimal;
    String animalType;
    
    
    public String getNameOfAnimal() {
        return nameOfAnimal;
    }
    
    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
    
   
    public void getAnimalDetails() {
        System.out.println("Character Details: " + getAnimalType());
    }
    
}
