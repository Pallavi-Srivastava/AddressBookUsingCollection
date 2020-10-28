package com.blz.addressbook;

import java.util.*;

public class AddressBookMain {

	static Scanner sc = new Scanner(System.in);

	static List<AddressBook> lst = new ArrayList<AddressBook>();

	public static void addContact() {
		System.out.println("Enter your firstName : ");
		String firstName = sc.nextLine();
		System.out.println("Enter your lastName : ");
		String lastName = sc.nextLine();
		System.out.println("Enter your address : ");
		String address = sc.nextLine();
		System.out.println("Enter your city : ");
		String city = sc.nextLine();
		System.out.println("Enter your state : ");
		String state = sc.nextLine();
		System.out.println("Enter your zipCode : ");
		String zip = sc.nextLine();
		System.out.println("Enter your phoneNo : ");
		String phoneNo = sc.nextLine();
		System.out.println("Enter your emailId : ");
		String email = sc.nextLine();

		AddressBook obj = new AddressBook(firstName, lastName, address, city, state, zip, phoneNo, email);
		lst.add(obj);
	}

	// UC3
	public static void editContact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name : ");
		String firstName = sc.nextLine();
		for (int i = 0; i < lst.size(); i++) {
			if (lst.get(i).getFirstName().equalsIgnoreCase(firstName)) {
				lst.remove(i);
				addContact();
			} else {
				System.out.println("No data found");
			}
		}
		sc.close();
	}

	public static void main(String[] args) {
		AddressBookMain oj = new AddressBookMain();
		System.out.println("Welcome to Address Book Program..");
		addContact();
		editContact();
		System.out.println(lst);
	}

}
