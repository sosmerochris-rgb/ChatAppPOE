/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assesmentforprog;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class AssesmentForPROG {
    

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("creat a account");
        loginClass login = new loginClass();
        
        //we start by getting the username 
         System.out.println("please enter a UserNme that you would like to use");
        String UserName = input.nextLine();
         
         //follow by creating a password 
         System.out.println("please enter a Password that you would like to use");
         String password = input.nextLine();
         
         //theh we get the user's valid south african phone Number
         System.out.println("please enter a valid south african phone number with the country code +27 e.g +271234567891");
         String PhoneNumber = input.nextLine();
         
         //validating if all the user's inputs are true
         boolean UserCheck = login.validateUserName(UserName);
         
         
          boolean PassCheck = login.validatePassword(password);
          
          boolean PhoneCheck = login.validatPhoneNumber(PhoneNumber);
          
          System.out.println("\n=====rtesults===");
          //display message for the userName 
          if (UserCheck){
              System.out.println("UserName is successfully captured");
          } else {
              System.out.println("the UserName you created does not meet our requirments, please make sure that the userName you created"
                      + "contains a underscore and the lenghth does not exceed 5 characters.");
          }
          
              //display message for the Password //lklll 
          if (PassCheck){
              System.out.println("Password is successfully captured");
          } else {
              System.out.println("the Password you created does not meet our requirments, please make sure that the Password you created"
                      + "is at least 8 characters long and contains a capital letter, a number, and any special character of your choice"
                      + "");
          }
          //display message for the PhoneNumber
              if (PhoneCheck){
              System.out.println("phone number is successfully captured");
          } else {
              System.out.println("the phone number you entered does not meet our requirments, please make sure that your phone number has is "
                      + "10 numders long and please use the valid south african code +27 ");
              }
              
              //the login part
              if (UserCheck && PassCheck && PhoneCheck){
               System.out.println("\n===LOGIN==="); 
               System.out.println("please enter UserName to LOgin");
               String loginForUser = input.nextLine();
               
               System.out.println("please enter Password to login");
               String LoginPass = input.nextLine();
               
               if (loginForUser.equals(UserName)&& LoginPass.equals(password)){
                 System.out.println("hi user you have successfully logged in");  
               } else {
                   System.out.println(" loggin failed. please enter valid userName and/or valid passwaord");
               }
          }
         
    }}
    

