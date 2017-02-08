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
public class AnimeCharacter extends TvShowCharacter {
    String nameOfCharacter;
    
    public String getNameOfCharacter() {
        return nameOfCharacter;
    }

    public void setNameOfCharacter(String nameOfCharacter) {
        this.nameOfCharacter = nameOfCharacter;
    }
    
    public void getCharacterProperties(){
        System.out.println("Character Properties: " + characterType );
        
    }
}
