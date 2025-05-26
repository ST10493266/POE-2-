/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registration;

/**
 *
 * @author RC_Student_lab
 */
import javax.swing.JOptionPane;
public class Register {

    public static void main(String[] args) {
     //Register
     JOptionPane.showMessageDialog(null, "Register a new user");
        String username = JOptionPane.showInputDialog("Enter username(must include'_' and be max 5 characters):");
        String password = JOptionPane.showInputDialog(null, "Enter Password(min 8 chars, 1 uppercase,1 number, 1 special char):");
        String firstName = JOptionPane.showInputDialog("Enter first name:");
        String lastName = JOptionPane.showInputDialog("Enter last name:");
        String cellPhoneNumber = JOptionPane.showInputDialog("Enter cell number(+27xxxxxxxxx):");
        
    Login login = new Login(username, password, firstName, lastName, cellPhoneNumber)  ; 
    String registrationResult = login.registerUser(true, true, true);
    JOptionPane.showInputDialog(null, registrationResult);
    
    if(!registrationResult.equals("User has been registered successfully.")){
        
    }
    //Login
    JOptionPane.showInputDialog(null, "== Log in ==");
    String loginUsername = JOptionPane.showInputDialog("Enter username");
    String loginPassword = JOptionPane.showInputDialog("Enter password");
    
    if(!login.loginUser(loginUsername,loginPassword)){
        JOptionPane.showInputDialog(null, "Username or password incorrect. Existing ...");
        return;
                }else{
        JOptionPane.showInputDialog(null, "Welcome" + firstName + ""+ lastName +"it is great to see you again");
    }
    }
    
    
