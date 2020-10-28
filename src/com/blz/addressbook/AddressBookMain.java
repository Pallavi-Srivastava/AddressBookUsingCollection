package com.blz.addressbook;

import java.util.*;

public class AddressBookMain {

	static Scanner sc = new Scanner(System.in);

	static List<AddressBook> lst = new ArrayList<AddressBook>();

	public static void addContact() {
		System.out.println("Enter your firstName : ");
		String firstName = sc.nextLine();
		// Restricted to duplicate entry
		for (int i = 0; i < lst.size(); i++) {
			if (lst.get(i).getFirstName().equalsIgnoreCase(firstName)) {
				System.out.println("This name is already exists try with another name");
				addPerson();
				break;
			}
		}
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
		System.out.println("Enter first name");
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

	// UC4
	public static void deleteContact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName = sc.nextLine();
		for (int i = 0; i < lst.size(); i++) {
			if (lst.get(i).getFirstName().equalsIgnoreCase(firstName)) {
				lst.remove(i);
			} else {
				System.out.println("No data found");
			}
		}
		sc.close();
	}

	// UC5
	public static void addPerson() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many AddressBook you want to add in system : ");
		int noOfAddressBook = sc.nextInt();
		int flag = 1;
		while (flag <= noOfAddressBook) {
			addContact();
			flag++;
		}
	}

	// UC8
	public void searchByCity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city name");
		String city = sc.nextLine();
		sc.close();
		for (AddressBook list : lst) {
			if (list.getCity().equals(city))
				System.out.println(list);
		}
	}

	public static void main(String[] args) {
		AddressBookMain oj = new AddressBookMain();
		System.out.println("Welcome to Address Book Program..");
		addPerson();
		oj.searchByCity();
	}

}