package com.blz.addressbook;

import java.util.*;

public class AddressBookMain {

	static Scanner sc = new Scanner(System.in);

	static List<AddressBook> lst = new ArrayList<AddressBook>();
	static List<AddressBookRecord> bookNameLst = new ArrayList<>();
	static Map<Integer, String> booksLst = new HashMap<>();
	boolean result;

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

	// UC4
	public static void deleteContact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name : ");
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

	// UC6
	public void addAddressBook() {
		System.out.println("Enter id : ");
		int id = sc.nextInt();
		System.out.println("Enter name : ");
		String bookName = sc.next();
		AddressBookRecord book = new AddressBookRecord(id, bookName);

		if (bookNameLst.isEmpty()) {
			bookNameLst.add(book);
			booksLst.put(id, bookName);
			System.out.println("New record added  : ");
		} else {
			for (int i = 0; i < bookNameLst.size(); i++) {
				if (bookNameLst.get(i).getBookName().equals(bookName)) {
					result = bookNameLst.get(i).getBookName().equals(bookName);
					System.out.println("Record is already exists : ");
					break;
				}
			}
			if (!result) {
				bookNameLst.add(book);
				booksLst.put(id, bookName);
				System.out.println("Record added successfully : ");
			}
		}
	}

	public static void main(String[] args) {
		AddressBookMain oj = new AddressBookMain();
		System.out.println("Welcome to Address Book Program..");
		oj.addAddressBook();
		System.out.println(booksLst);
	}
}
