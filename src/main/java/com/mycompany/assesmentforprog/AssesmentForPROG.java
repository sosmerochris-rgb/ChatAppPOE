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
          Scanner input = new Scanner(System.in);
        loginClass login = new loginClass();

        
        System.out.println("=== REGISTER ===");
        System.out.print("Enter First Name: ");
        String fName = input.nextLine();
        System.out.print("Enter Last Name: ");
        String lName = input.nextLine();
        System.out.print("Enter Username: ");
        String user = input.nextLine();
        System.out.print("Enter Password: ");
        String pass = input.nextLine();
        System.out.print("Enter Cell Number: ");
        String cell = input.nextLine();

        if(!login.validatPhoneNumber(cell)){
            System.out.println("Cell phone number incorrectly formatted");
            return;
        }

        String reg = login.registerUser(user, pass);
        System.out.println(reg);

        if(!reg.equals("User has been registered successfully.")){
            return;
        }

        System.out.println("\n=== LOGIN ===");
        System.out.print("Username: ");
        String loginUser = input.nextLine();
        System.out.print("Password: ");
        String loginpass = input.nextLine();

        boolean loggedIn = login.loginUser(loginUser,);
        System.out.println(login.returnLoginStatus(loggedIn, fName, lName));

        if(!loggedIn){
            return;
        }

        System.out.println("\nWelcome to QuickChat.");

        System.out.print("How many messages do you want to enter? ");
        int limit = Integer.parseInt(input.nextLine());

        message msgClass = new message();
        int count = 0;
        boolean running = false;

        while(running){
            System.out.println("\nChoose an option:");
            System.out.println("1) Send Messages");
            System.out.println("2) Show recently sent messages");
            System.out.println("3) Quit");
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(input.nextLine());

            if(choice == 1){
                if(count >= limit){
                    System.out.println("You have reached your message limit of " + limit);
                    continue;
                }

                
                String id = msgClass.generateID();
                System.out.print("Enter Recipient (+27... max 12 chars): ");
                String recipient = input.nextLine();

                String checkRec = msgClass.checkRecipientCell(recipient);
                System.out.println(checkRec);
                if(checkRec.contains("incorrectly")){
                    continue;
                }

                System.out.print("Enter Message (max 250 chars): ");
                String text = input.nextLine();

                if(text.length() > 250){
                    System.out.println("Please enter a message of less than 250 characters.");
                    continue;
                } else {
                    System.out.println("Message sent");
                }

                count++;
                String hash = msgClass.checkMessageHash(id, count, text);

                System.out.println("\n--- Message Details ---");
                System.out.println("Message ID: " + id);
                System.out.println("Message Hash: " + hash);
                System.out.println("Recipient: " + recipient);
                System.out.println("Message: " + text);

                System.out.println("\nWhat do you want to do?");
                System.out.println("1) Send Message");
                System.out.println("2) Disregard Message");
                System.out.println("3) Store Message to send later");
                System.out.print("Choice: ");
                int sendChoice = Integer.parseInt(input.nextLine());

                String result = msgClass.sentMessage(sendChoice);
                System.out.println(result);

                if(sendChoice == 1){
                    message.totalMessages++;
                    message.allMessages += "\n" + id + " " + hash + " " + recipient + " " + text;
                    msgClass.storeMessage(id, hash, recipient, text);
                } else if(sendChoice == 3){
                    msgClass.storeMessage(id, hash, recipient, text);
                    System.out.println("Stored to messages.json");
                }

            } else if(choice == 2){
                System.out.println("Coming Soon.");
            } else if(choice == 3){
                System.out.println("Total messages sent: " + message.totalMessages);
                System.out.println("Quitting...");
                running = false;
            }
        }

        input.close();
    }
}
    

