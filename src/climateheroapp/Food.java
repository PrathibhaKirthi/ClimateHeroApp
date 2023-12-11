/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClimateHeroApp;

/**
 *
 * @author Prathibha Kirthi
 */
public class Food {
    
   private double carbon;
   private int score;
   
   
    
    public Food(){
        super();
        carbon= 0.0;
        score = 0;
    }

    public Food(double carbon, int score) {
        this.carbon = carbon;
        this.score = score;
    }
    

    public Double getCarbonFootprint() {
        return carbon;
    }

    public void setCarbonFootprint(String carbonFootprint) {
        this.carbon = carbon;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

   
    
}
