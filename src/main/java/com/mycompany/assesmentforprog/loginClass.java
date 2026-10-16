  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assesmentforprog;
import java.util.regex.Pattern;
/**
 *
 * @author Student
 */
public class loginClass {

    private String savedUsername;
    private String savedPassword;

    public boolean validateUserName(String username) {
        return username.length() <= 5 && username.contains("_");
    }

    public boolean validatePassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasCapital = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasCapital = true;
            }
            if (Character.isDigit(ch)) {
                hasNumber = true;
            }
            if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }

        return hasCapital && hasNumber && hasSpecial;
    }

    public boolean validatPhoneNumber(String phoneNumber) {
        return phoneNumber.startsWith("+27") && phoneNumber.length() == 12;
    }

    public String registerUser(String username, String password) {
        if (!validateUserName(username)) {
            return "Username is not correctly formatted, please ensure that your username "
                    + "contains an underscore and is no more than five characters in length.";
        }
        if (!validatePassword(password)) {
            return "Password is not correctly formatted, please ensure that the password "
                    + "contains at least eight characters, a capital letter, a number, "
                    + "and a special character.";
        }

        savedUsername = username;
        savedPassword = password;
        return "User has been registered successfully.";
    }

    public boolean loginUser(String username, String password) {
        return username.equals(savedUsername) && password.equals(savedPassword);
    }

    public String returnLoginStatus(boolean loggedIn, String firstName, String lastName) {
        if (loggedIn) {
            return "Welcome " + firstName + " " + lastName + ", it is great to see you again.";
        }
        return "Username or password incorrect, please try again.";
    }
}
    
