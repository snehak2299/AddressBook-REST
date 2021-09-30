package com.bridglab.addressbook.model;

import java.util.List;

import com.bridglab.addressbook.dto.AddressBookDTO;

import lombok.Data;

public @Data class AddressBookData {
	private int contactId;
	public String name;
	public String city;
	public String phoneNo;
	public String address;
	public String state;
	public int zip;
	private List<String> types;
	
	public AddressBookData(int contactId,AddressBookDTO addressbookdto) {
		super();
		this.contactId = contactId;
		this.name = addressbookdto.name;
		this.city = addressbookdto.city;
		this.phoneNo = addressbookdto.phoneNo;
		this.address =addressbookdto. address;
		this.state = addressbookdto.state;
		this.zip = addressbookdto.zip;
		this.types = addressbookdto.types;
	}
	
	
	

}
