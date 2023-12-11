package climateheroapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 * Abstract superclass of all carbon (CO2) emission related classes
 * @author idiltatar
 */
public abstract class Carbon {

    protected String date; // Date of CO2 emissions (We are assuming the date format: "yyyy-MM-dd")
    protected double carbon; // Amount of CO2 emissions (usually calculated in kilograms)

    protected String getDate() {
        return date;
    }

    protected void setDate(String date) {
        this.date = date;
    }

    protected double getCarbon() {
        return carbon;
    }

    protected void setCarbon(double carbon) {
        this.carbon = carbon;
    }
    
    abstract public void calculateCarbon();
    
    abstract public String getCarbonDetails();

}
