package com.bayviewglen.dayfour;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AddressBook {
	Scanner scanner = new Scanner(System.in);
	HashMap<String, Person> addressBook = new HashMap<String, Person>();

	// bug when gathering info: runs too fast for the user to input.
	// ^ FIXED: changed by: scanner.nextLine(); --> String x =
	// scanner.nextLine();

	// bug when adding a contact, not adding to hashmap (checked in debug) (ask
	// deslauriers for help)
	// can't use person object for a key.
	// ^ FIXED now use a last name as a key, and a person object as a value.

	// bug when printing the person object. "The contact information is:
	// com.bayviewglen.dayfour.Person@33909752"
	// ^ FIXED by creating toString() method in my Person class.

	public void prompt() {

		// option select
		boolean done = false;
		contactsFromFile();
		while (!done) {
			System.out.println("\n\nWelcome to David Hew-wing's AddressBook!");
			System.out.println("Select what you would like to do");
			System.out.println("Press 1: Add new contact. " + "\n" + "Press 2: Search for a contact" + "\n"
					+ "Press 3: Delete a contact" + "\n" + "Press 4: Display all contacts" + "\n" + "Press 5: Exit!" + "\n" + "Press 6: To save to file");
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
			}else  if(selection == 6){
				writeContacts();
			} else {
				System.out.println("Enter the corresponding integer.");
			}
		}
		
		
		
	}

	private void displayAll() {
		System.out.println("Here are all the people:");
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
		// making sure user not dumb.
		if (!addressBook.containsKey(lastName)) {
			System.out.println("Contact is not in the directory.");
		} else {
			// deleting contact
			addressBook.remove(lastName);
			System.out.println("The contact has been removed");

		}

	}
	
    public void writeContacts() {
        try {
               FileWriter writer = new FileWriter("data/addressBookData.dat");
               for (String lName : addressBook.keySet()) {
                      writer.write(addressBook.get(lName).getIName() + "\n"); // get first name
                      writer.write(addressBook.get(lName).getLName() + "\n"); // get last name
                      writer.write(addressBook.get(lName).getPhone() + "\n");// get phone.
               }

               writer.close();
        } catch (IOException e) {
               e.printStackTrace();
        }
        System.out.println("Your entries have been saved.");
  }

	
    
    public void contactsFromFile() {
        try {
               Scanner fileScan = new Scanner(new File("data/addressBookData.dat"));
               String fname;
               String lname;
               String phone;
               while (true) {
                      try {
                            fname = fileScan.nextLine();
                            lname = fileScan.nextLine();
                            phone = fileScan.nextLine();
                      } catch (NoSuchElementException e) {
                            break;
                      }
                      Person person = new Person(fname, lname, phone); 
                      
                      addressBook.put(lname, person);
               }
        } catch (FileNotFoundException e) {
               e.printStackTrace();
        }
  }


}

