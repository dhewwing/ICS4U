package com.bayviewglen.contactlist;

import java.util.Scanner;

public class ContactList {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main (String[] args){
		
		boolean done = false;
		
		while (!done) {
			System.out.println("\n\nWelcome to David Hew-wing's AddressBook!");
			System.out.println("Select what you would like to do:");
			System.out.println("Press 1: Add new contact. " + "\n" + "Press 2: Search for a contact" + "\n"
					+ "Press 3: Delete a contact" + "\n" + "Press 4: Display all contacts" + "\n" + "Press 5: Exit!");
			System.out.println("Please enter a integer or it will crash!");
			
			int selection = scanner.nextInt();

			if (selection == 1) {
				addContact();
				
			} else if (selection == 2) {
				searchContact();

			} else if (selection == 3) {
				deleteContact();

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

	private static void displayAll() {
		
	
	}

	private static void deleteContact() {
		
		
	}

	private static void searchContact() {
		
		
	}

	private static void addContact() {
		
		System.out.println("Enter the first name \n");
		scanner.nextLine();
		String firstName = scanner.nextLine();
		System.out.println("Enter the last name \n");
		String lastName = scanner.nextLine();
		System.out.println("Enter the phone number (no spaces or dashes)");
		String phone = scanner.nextLine();
		//Making the contact.
		
		Contact tempContact = new Contact(firstName, lastName, phone);
		
	}
	
}
