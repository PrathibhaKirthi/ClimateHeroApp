/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package climateheroapp;

import java.io.Serializable;

/**
 *
 * @author Vitor Colley
 */
public class TrueOrFalse extends Question implements Serializable{
    private String option1, option2;

    public TrueOrFalse(String option1, String option2, String question, String correction, String answ, int level, int id) {
        super(question, correction, answ, level, id);
        this.option1 = option1;
        this.option2 = option2;
    }

    public TrueOrFalse() {
        super();
        option1 = " ";
        option2 = " ";
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }
    
    
    
}
