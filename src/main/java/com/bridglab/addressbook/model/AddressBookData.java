package com.bridglab.addressbook.model;

import com.bridglab.addressbook.dto.AddressBookDTO;

import lombok.Data;

public @Data class AddressBookData {
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
	

}
