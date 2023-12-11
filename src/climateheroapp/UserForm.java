package climateheroapp;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Prathibha Kirthi
 */
public class UserForm extends javax.swing.JFrame{
    private ArrayList <UserForm> players;
    private String name;
    private String dateOfBirth;
    private String email;
    private String password;
    private int phoneNo;

    public UserForm(String name, String dateOfBirth, String email, String password, int phoneNo) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.password = password;
        this.phoneNo = phoneNo;
    }
    
    public UserForm(){
        name = " ";
        dateOfBirth = " ";
        email = " ";
        password = " ";
        phoneNo = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }
    public String getDetails(){
        return "Player Details: "+name+" , "+dateOfBirth+" , "+phoneNo+" , "+email+" , "+password; 
    }
    
    
    
}
