package com.bayviewglen.dayfour;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
	Scanner scanner = new Scanner(System.in);
	HashMap<Person, Integer> addressBook = new HashMap<Person, Integer>();

	// bug when gathering info: runs too fast for the user to input.
	// ^ fixed: changed by: scanner.nextLine(); --> String x = scanner.nextLine();
	
	// bug when adding a contact, not adding to hashmap (checked in debug) (ask deslauriers for help)
	public void prompt() {

		// option select
		boolean done = false;

		while (!done) {
			System.out.println("\n\n Welcome to David Hew-wing's AddressBook!");
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
				System.out.println("Peace fam.");
				System.exit(0);
			}
		}
	}

	private void displayAll() {

		for (Person x : addressBook.keySet()) {
			if (x == null) {
				System.out.println("Directory is empty");
			} else {
				System.out.println(x + " " + addressBook.get(x));
			}
		}

	}

	private void searchContact() {
		// gatherin data
		System.out.println("Enter the first name \n");
		scanner.nextLine();
		String firstName = scanner.nextLine();
		System.out.println("Enter the last name \n");
		String lastName = scanner.nextLine();
		// initing person
		Person newPerson = new Person(firstName, lastName);

		if (addressBook.containsKey(newPerson)) {
			System.out.println("The contact information is: " + addressBook.get(newPerson));
		} else {
			System.out.println("Contact: " + firstName + " " + lastName + " isn't in the directory.");
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
		int phone = scanner.nextInt();
		// initing the person.
		Person tempPerson = new Person(firstName, lastName);
		// entering the person.
		addressBook.put(tempPerson, phone);
		System.out.println("Contact has been added");
	}

	private void deleteContact() {

		// gathering data
		System.out.println("Enter the first name \n");
		scanner.nextLine();
		String firstName = scanner.nextLine();
		System.out.println("Enter the last name \n");
		String lastName = scanner.nextLine();
		// initing the person.
		Person newPerson = new Person(firstName, lastName);
		// making sure user isn't an idiot
		if (!addressBook.containsKey(newPerson)) {
			System.out.println("Contact is not in the directory.");
		} else {
			// deleting contact
			addressBook.remove(newPerson);
			System.out.println("The contact has been removed");

		}
	}

	public static void main(String[] args) {

	}
}
