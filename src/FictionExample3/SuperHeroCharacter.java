/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FictionExample3;

import javax.swing.JOptionPane;

/**
 *
 * @author kevinjerke
 */
public class SuperHeroCharacter {
    String superPowers; 
    String heroicMoments; 
    
    public String getSuperPowers() {
        return superPowers;
    }

    public void setSuperPowers(String superPowers) {
        this.superPowers = superPowers;
    }

    public String getHeroicMoments() {
        return heroicMoments;
    }

    public void setHeroicMoments(String heroicMoments) {
        this.heroicMoments = heroicMoments;
    }
    
    public void getMovieDetails(){
        JOptionPane.showMessageDialog(null, "Movie Details: " + getHeroicMoments());
    }
    
}
