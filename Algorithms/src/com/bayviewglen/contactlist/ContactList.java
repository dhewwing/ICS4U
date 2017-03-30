package com.bayviewglen.contactlist;

import java.util.Scanner;

public class ContactList {

	static Scanner scanner = new Scanner(System.in);
	
	private static BinarySearchTree contactList;
	
	public ContactList(){
		contactList = new BinarySearchTree();
	}
	
	//function for adding
	public static void add(String name, String phone){
		Contact cont = new Contact(name, phone);
		contactList.insert(cont);
		System.out.println("\nYou have added the contact " + cont.toString() + ".");
	}
	//user interface for adding
	public static void addUI(){
		System.out.println("What is the name of the contact?");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("What is the phone number of the contact?");
		String phone = scanner.nextLine();
		add(name,phone);
		
	}
	
	
	public static void main (String[] args){
		
		contactList = new BinarySearchTree();
		
		
		boolean done = false;
		
		while (!done) {
			System.out.println("\nWelcome to David Hew-wing's AddressBook!");
			System.out.println("Select what you would like to do:");
			System.out.println("Press 1: Add new contact. " + "\n" + "Press 2: Search for a contact" + "\n"
					+ "Press 3: Delete a contact" + "\n" + "Press 4: Display all contacts" + "\n" + "Press 5: Exit!");
			System.out.println("Please enter a integer or it will crash!1"
					+ "");
			
			int selection = scanner.nextInt();

			if (selection == 1) {
				addUI();
				
			} else if (selection == 2) {
				searchContact();

			} else if (selection == 3) {
				deleteUI();

			} else if (selection == 4) {
				displayAll();

			} else if (selection == 5) {
				System.out.println("See ya!");
				System.exit(0);
			} else {
				System.out.println("Enter the corresponding integer.");
			}
		}
	
	}

	//displays the bst using InOrder traversal
	private static void displayAll() {
		contactList.printAll(contactList.root);
	}

	//delete function
	private static void deleteContact(String response) {
		
		Contact temp = new Contact(response);
		contactList.delete(temp);	
		
	}
	
	//user interface for the delete function
	private static void deleteUI(){
		
		System.out.println("What is the name of the contact you would like to delete");
		scanner.nextLine();
		String response = scanner.nextLine();
		deleteContact(response);
	}
	
	//serach contact.
	private static void searchContact() {
		
		System.out.println("What is the name of the person you would like to search for?");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("What is the phone number?");
		String phone = scanner.nextLine();
		
		Contact cont = new Contact(name,phone);
		
		contactList.search(cont);
		
	}
}
