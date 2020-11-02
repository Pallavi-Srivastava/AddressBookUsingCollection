package com.blz.addressbook;

public class AddressBookRecord {
	private int id;
	private String bookName;

	@Override
	public String toString() {
		return "AddressBookRecord [id=" + id + ", bookName=" + bookName + "]";
	}

	public AddressBookRecord(int id, String bookName) {
		super();
		this.id = id;
		this.bookName = bookName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
}
