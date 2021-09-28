package com.bridglab.addressbook.model;

import com.bridglab.addressbook.dto.AddressBookDTO;

import lombok.Data;

public class AddressBookData {
	private int contactId;
	public String name;
	public String city;
	public String phoneNo;
	public AddressBookData(int contactId, AddressBookDTO addressbookdto) {
		super();
		this.contactId = contactId;
		this.name =addressbookdto.name;
		this.city = addressbookdto.city;
		this.phoneNo = addressbookdto.phoneNo;
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	

}
