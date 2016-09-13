package com.bayviewglen.daytwo;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
// hi
public class AddressBook {
	private static ArrayList<Contact> list;

	public static void displayAll(ArrayList<Contact> list) {
		for (Contact x : list) {
			System.out.println(x);
		}
	}

	public static Contact display(ArrayList<Contact> list) {
		boolean done = false;

		while (!done) {
			System.out.println("Enter your selection type, name or phone? (Enter for your selection.)");
			Scanner scanner = new Scanner(System.in);
			String s = scanner.nextLine();

			if (s.equalsIgnoreCase("name")) {
				System.out.println("Enter the name!");
				String tempName = scanner.nextLine();

				for (int i = 0; i < list.size(); i++) {
					if (list.contains(tempName)) {
						int index = list.indexOf(tempName);
						System.out.println("Here is the contact information: " + list.get(index));
						return list.get(index);
					}

				}

			}

			else if (s.equalsIgnoreCase("phone")) {
				System.out.println("Enter the phone number!");
				String tempPhone = scanner.nextLine();

				for (int i = 0; i < list.size(); i++) {
					if (list.contains(tempPhone)) {
						int index = list.indexOf(tempPhone);
						System.out.println("Here is the contact information" + list.get(index));
						return list.get(index);
					}
				}
			}

			else {
				System.out.println("This phone number or person is not in our current list");
			}

		}
		return null;
	}

	public void deleteContact(Contact contact) {
		System.out.println("Which criteria of contact information would you like to search for?");
		System.out.println("Type phonenumber, firstname, or lastname. If you would like to leave type EXIT");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();

		while (true) {

			if (s.equalsIgnoreCase("phonenumber")) {

			}

			else if (s.equalsIgnoreCase("firstname")) {
				// add something
			}

			else if (s.equalsIgnoreCase("lastname")) {
				// add something
			} else if (s.equalsIgnoreCase("exit")) {
				break;
			} else
				System.out
						.println("This person or number is not in the directly, or you have eneted an invalid entry.");

		}
	}

	public static void main(String[] args) {

		System.out.println("Welcome to the address book Directory!");
		
		boolean done = false;

		while (!done) {
			System.out.println("What would you like to do?");
			System.out.println("");
			System.out.println("Press 1 for: Adding a Contact");
			System.out.println("Press 2 for: Deleting a Contact");
			System.out.println("Press 3 for: Looking a Contact up");
			System.out.println("Press 4 for:Display all the contacts in the address book");
			System.out.println("Press 5 for: To exit the program");

			Scanner scanner = new Scanner(System.in);
			String s = scanner.nextLine();

			if (s.equals("1")) {

				String firstName = "";
				String lastName = "";
				String phoneNumber = "";

				Contact contact = new Contact(firstName, lastName, phoneNumber);

				System.out.println("Enter the First Name");
				firstName = scanner.nextLine();
				contact.setIName(firstName);
				System.out.println("Enter the Last Name");
				lastName = scanner.nextLine();
				contact.setlName(lastName);
				System.out.println("Enter the phone number");
				phoneNumber = scanner.nextLine();
				contact.setPhone(phoneNumber);

				list.add(contact);

				System.out.println("Here is your contact information");

				System.out.println(contact.getIName(firstName));
				System.out.println(contact.getLName(lastName));
				System.out.println(contact.getPhone(phoneNumber));
			}
			if (s.equals("2")) {

				while (!done) {

					System.out.println("Enter the First Name of the contact you would like to delete");
					scanner = new Scanner(System.in);
					String fName = scanner.nextLine();
					System.out.println("Enter the Last Name of the contact you would like to delete");
					String lName = scanner.nextLine();
					System.out.println("Enter the Phone Number of the contact you would like to delete");
					String phoneNum = scanner.nextLine();

					Contact tempContact = new Contact(fName, lName, phoneNum);

					if (list.contains(tempContact)) {
						list.remove(tempContact);
					} else
						System.out.println("Contact cannot be found. return to main menu? yes/no?");
					String respone = scanner.nextLine();
					if (respone.equalsIgnoreCase("yes")) {
						done = true;
					} else if (respone.equalsIgnoreCase("no")) {
						continue;
					}
				}

			}
			if (s.equals("3")) {
				display(list);
			}
			if (s.equals("4")) {
				displayAll(list);
			}
			if (s.equals("5")) {
				System.out.println("Goodbye!");
				System.exit(0);

			}
		}
	}
}
