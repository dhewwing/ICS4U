package com.bayviewglen.dayfour;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
	Scanner scanner = new Scanner(System.in);
	HashMap<String, Person> addressBook = new HashMap<String, Person>();

	// bug when gathering info: runs too fast for the user to input.
	// ^ FIXED: changed by: scanner.nextLine(); --> String x = scanner.nextLine();
	
	// bug when adding a contact, not adding to hashmap (checked in debug) (ask deslauriers for help)
	// can't use person object for a key.
	// ^ FIXED now use a last name as a key, and a person object as a value.
	
	// bug when printing the person object. "The contact information is: com.bayviewglen.dayfour.Person@33909752"
	// ^ FIXED by creating toString() method in my Person class.
	
	public void prompt() {

		// option select
		boolean done = false;

		while (!done) {
			System.out.println("\n\nWelcome to David Hew-wing's AddressBook!");
			System.out.println("Select what you would like to do");
			System.out.println("Press 1: Add new contact. " + "\n" + "Press 2: Search for a contact" + "\n"
					+ "Press 3: Delete a contact" + "\n" + "Press 4: Display all contacts" + "\n" + "Press 5: Exit!");

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
			}else{
				System.out.println("Enter the corresponding integer.");
			}
		}
	}

	private void displayAll() {

		for (String x : addressBook.keySet()) {
			if (x == null) {
				System.out.println("Directory is empty");
			} else {
				System.out.println(addressBook.get(x));
			}
		}

	}

	private void searchContact() {
		// gatherin data
		System.out.println("Enter the last name \n");
		scanner.nextLine();
		String lastName = scanner.nextLine();
		// initing person
		if (addressBook.containsKey(lastName)) {
			System.out.println("The contact information is: " + addressBook.get(lastName));
		} else {
			System.out.println("Contact: " + lastName + " isn't in the directory.");
		}
	}

	private void addContact() {

		// getting the data.
		System.out.println("Enter the first name \n");
		scanner.nextLine();
		String firstName = scanner.nextLine();
		System.out.println("Enter the last name \n");
		String lastName = scanner.nextLine();
		System.out.println("Enter the phone number (no spaces or dashes)");
		String phone = scanner.nextLine();
		// initing the person.
		Person tempPerson = new Person(firstName, lastName, phone);
		// entering the person.
		addressBook.put(lastName, tempPerson);
		System.out.println("Contact has been added");
	}

	private void deleteContact() {

		// gathering data
		System.out.println("Enter the last name");
		scanner.nextLine();
		String lastName = scanner.nextLine();
		//making sure user not dumb.
		if (!addressBook.containsKey(lastName)) {
			System.out.println("Contact is not in the directory.");
		} else {
			// deleting contact
			addressBook.remove(lastName);
			System.out.println("The contact has been removed");

		}
		
	}

	public static void main(String[] args) {

	}
}
