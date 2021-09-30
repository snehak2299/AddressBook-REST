package com.bridglab.addressbook.dto;

import java.util.List;

import javax.validation.constraints.Pattern;

import lombok.ToString;

public @ToString class AddressBookDTO {
	@Pattern(regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$",message="contact name Invalid") //validation added for name
	public String name;
	public String city;
	public String phoneNo;
	public String address;
	public String state;
	public int zip;
	public List<String> types;
	
	public AddressBookDTO() {
	}
	
	
}
