/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package climateheroapp;

/**
 *
 * @author Prathibha Kirthi
 */
public class Waste {
    private double carbon;
   private int score;
   
   
    
    public Waste(){
        super();
        carbon= 0.0;
        score = 0;
    }

    public Waste(double carbon, int score) {
        this.carbon = carbon;
        this.score = score;
    }

    public double getCarbon() {
        return carbon;
    }

    public void setCarbon(double carbon) {
        this.carbon = carbon;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
}
