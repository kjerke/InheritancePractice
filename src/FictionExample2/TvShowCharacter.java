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
public class TvShowCharacter {
    String characterType;
    String nameOfCharacter;


    public String getCharacterType() {
        return characterType;
    }

    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }
    
    
    
    public void getCharacterProperties(){
        System.out.println("Character Properties: " + characterType );  
    }
    
}
