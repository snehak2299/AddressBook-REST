package com.bridglab.addressbook.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.ToString;

public @ToString class AddressBookDTO {
	@Pattern(regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$",message="contact name Invalid") //validation added for name
	public String name;
	
	@NotBlank(message="city cannot be Empty")
	public String city;
	
	@Pattern(regexp="(0/91)?[7-9][0-9]{9}",message="Phone number is Invalid")
	public String phoneNo;
	
	@NotBlank(message="address cannot be Empty")
	public String address;
	
	@NotNull(message="state should not be empty")
	public String state;
	
	@NotNull(message="zipt should not be empty")
	public int zip;
	
	@NotNull(message="type of address book can not be empty")
	public List<String> types;
	
	public AddressBookDTO() {
	}
	
	
}
