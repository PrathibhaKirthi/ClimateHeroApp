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
public class Question implements Serializable{
    protected String question, correction, answ;
    protected int id, level;

    public Question() {
        question = " ";
        correction = " ";
        answ = " ";
        id = 0;
        level = 0;
    }
    public Question(String question, String correction, String answ, int level, int id) {
        this.question = question;
        this.correction = correction;
        this.answ = answ;
        this.level = level;
        this.id = id;
    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrection() {
        return correction;
    }

    public void setCorrection(String correction) {
        this.correction = correction;
    }

    public String getAnsw() {
        return answ;
    }

    public void setAnsw(String answ) {
        this.answ = answ;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    } 
    
}
