/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.assesmentforprog;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class loginClassTest {
    
    public loginClassTest() {
    }
    
    
    
    @Test
    public void testValidateUserName() {
        System.out.println("validateUserName");
        String UserName = "so_so";
        loginClass instance = new loginClass();
        boolean expResult = true;
        boolean result = instance.validateUserName(UserName);
        assertEquals(expResult, result);
       
    }

    @Test
    public void testInValidateUserName() {
        System.out.println("validateUserName");
        String UserName = "soo11sstr";
        loginClass instance = new loginClass();
        boolean expResult = false;
        boolean result = instance.validateUserName(UserName);
        assertEquals(expResult, result);
        
    }
    //this is to testwhether the password is valid
    @Test
    public void testValidatePassword() {
        System.out.println("validatePassword");
        String password = "Chris!1u";
        loginClass instance = new loginClass();
        boolean expResult = true;
        boolean result = instance.validatePassword(password);
        assertEquals(expResult, result);
        
    }
    //this is to test whether thge password is wrong
    @Test
    public void testInValidatePassword() {
        System.out.println("validatePassword");
        String password = "passward";
        loginClass instance = new loginClass();
        boolean expResult = false;
        boolean result = instance.validatePassword(password);
        assertEquals(expResult, result);
       
    }

   
    @Test
    public void testValidatPhoneNumber() {
        System.out.println("validatPhoneNumber");
        String PhoneNumber = "+27123456789";
        loginClass instance = new loginClass();
        boolean expResult = true;
        boolean result = instance.validatPhoneNumber(PhoneNumber);
        assertEquals(expResult, result);
       
    }
    @Test
    public void testInValidatPhoneNumber() {
        System.out.println("validatPhoneNumber");
        String PhoneNumber = "+2712345789";
        loginClass instance = new loginClass();
        boolean expResult = false;
        boolean result = instance.validatPhoneNumber(PhoneNumber);
        assertEquals(expResult, result);
       
    }
}
