package com.arcada.devops;

import java.util.Scanner;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
        System.out.println("Welcome to FriendGallery!");
        
        System.out.println("Please enter a profile name.");
        String nameInput = input.nextLine();
        
        String[] friendList = getFriendList(nameInput);
        
        // Output friend list
        System.out.println("Friend list of user " + nameInput);
        for (int i = 0; i < friendList.length; i++) {
        	System.out.println(friendList[i]);
        }
       
        
    }
    
    public static String[] getFriendList(String username) {
    	// Hardcoded friend list
    	String[] friendList = {"David Rodriguez", "Jessica Moore", "Michael Brown", "John Lopez", "Linda Anderson", "Sarah Wilson"};
    	return friendList;
    }
}
