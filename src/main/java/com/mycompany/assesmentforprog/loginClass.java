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
    String UserName;  
    String password;
    String PhoneNumber;
    
    public  boolean validateUserName(String UserName) {
    
        if(UserName.length() <=5 && UserName.contains("_")){
            return true;
        }else{
            return false;
        }
    
    }

    public  boolean validatePassword(String password) {
        boolean gotCapital = false;
        boolean gotNumber = false;
        boolean gotSpecial = false;
    
    if(password.length() <8){
    return false;
}
  for(int i =0; i < password.length(); i++){
      
   char ch = password.charAt(i);
   if(Character.isUpperCase(ch)){
     gotCapital = true;}
  
   if(Character.isDigit(ch)){
       gotNumber = true; 
   }
   if(!Character.isLetterOrDigit(ch)){
       gotSpecial = true;
   }
   }
  if(gotCapital && gotNumber && gotSpecial ){
      return true;
  }else{
      return false;
  }
    }

    public  boolean validatPhoneNumber(String PhoneNumber) {
        if(PhoneNumber.startsWith("+27") && PhoneNumber.length() == 12){
            return true;
        }else {
    return false;
}
}}
    
