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

	public static void main(String[] args) {
		AddressBookMain oj = new AddressBookMain();
		System.out.println("Welcome to Address Book Program..");
		System.out.println("Enter New Contact Details : ");
		int flag = 1;
		while (flag == 1) {
			addContact();
			flag--;
		}
		System.out.println(lst);
	}

}
