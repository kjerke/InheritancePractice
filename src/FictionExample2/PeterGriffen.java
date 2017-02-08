/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FictionExample2;

/**
 *
 * @author kevinjerke
 */
public class PeterGriffen extends AnimeCharacter{
    
    String nameOfShowCharacterIsIn;

    public String getNameOfShowCharacterIsIn() {
        return nameOfShowCharacterIsIn;
    }

    public void setNameOfShowCharacterIsIn(String nameOfShowCharacterIsIn) {
        this.nameOfShowCharacterIsIn = nameOfShowCharacterIsIn;
    }
    
    
    
    
       public void getCharacterProperties(){
        System.out.println("Character Properties: " + characterType );  
    }
}
