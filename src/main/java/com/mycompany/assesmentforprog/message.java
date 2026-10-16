/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assesmentforprog;
import org.json.JSONObject;
import java.util.Random;
import java.io.FileWriter;
/**
 *
 * @author Student
 */
public class message {

    public static int totalMessages = 0;
    public static String allMessages = "";

    public String generateID() {
        Random random = new Random();
        String id = "";
        for (int i = 0; i < 10; i++) {
            id += random.nextInt(10);
        }
        return id;
    }

    public boolean checkMessageID(String id) {
        return id.length() <= 10;
    }

    public String checkRecipientCell(String cell) {
        if (cell.length() <= 10 && cell.startsWith("+")) {
            return "Cellphone number successfully captured.";
        }
        return "The phone number is incorrectly formatted or does not contain an international code.";
    }

    public String checkMessageHash(String id, int num, String message) {
        String[] words = message.split(" ");
        String first = words[0];
        String last = words[words.length - 1];

        String hash = id.substring(0, 2) + ":" + num + ":" + first + last;
        return hash.toUpperCase();
    }

    public String sentMessage(int choice) {
        if (choice == 1) {
            return "Message has been sent successfully.";
        }
        if (choice == 2) {
            return "Message has been discarded.";
        }
        if (choice == 3) {
            return "Message is successfully stored.";
        }
        return "Invalid choice.";
    }

    public void storeMessage(String id, String hash, String recipient, String text) {
        JSONObject obj = new JSONObject();
        obj.put("messageID", id);
        obj.put("messageHash", hash);
        obj.put("recipient", recipient);
        obj.put("message", text);

        try (FileWriter file = new FileWriter("messages.json", true)) {
            file.write(obj.toString(4) + "\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }}
        
       


