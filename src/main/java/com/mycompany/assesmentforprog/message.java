/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assesmentforprog;
import org.json.JSONObject;
import java.util.Random;
import java.io.FilterWriter;
/**
 *
 * @author Student
 */
public class message {
    String messageID;
    String recipient; 
    String messageText; 
    String hash;
    static int total = 0;
    
    public boolean checkMessageID(String id){
    if(id.length()<=10)
    {return true;}
    else {return false;}
    }
    
}
public String checkRecipientCell( String cell){
if (cell.length()<=10 && cell.startsWith("+")){
    return "cellphone succefully captured"; 
}else{
    return "the phone number is incorrectly formmated or may not contain a international code";
}}

public String checkMessageHash( String id, int num, String message){
String[] parts = message.split(" ");
String first = parts[0];
String last = parts[parts.length-1];
String h = id.substring(0,2) + ":" + num+ ":" + first + last;
return h.toUpperCase();
}

public String sentMessage(int choice){
if (choice == 1){ return "message has been sent succesfully"; }
if (choice == 2 ){ return "click ) to delete this message";}
if (choice == 3 ){return "message is succefully stored";}
return "invalid";
}

//this is the storeMessagefor the JSON where i do research part
public void storeMessage(String id, String hash, String rec, String text){
try{
    org.json.JSONObject obj = new org.json.JSONObject();
    obj.put("messageID", id);
    obj.put("messageHash", hash);
    obj.put("recipient", rec);
    obj.put("message", text);
    java.io.FileWriter file = new java.io.FilterWriter("message.json", true);
    file.write(obj.toString(4)) + "\n";
     file.close();
    } catch(Exception e){
            System.out.println(e.getMessage());
            }
}
        
       


