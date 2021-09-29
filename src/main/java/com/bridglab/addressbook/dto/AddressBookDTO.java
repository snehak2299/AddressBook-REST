package com.bridglab.addressbook.dto;

import javax.validation.constraints.Pattern;

public class AddressBookDTO {
	@Pattern(regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$",message="contact name Invalid") //validation added for name
	public String name;
	public String city;
	public String phoneNo;
	
	public AddressBookDTO() {
	}
	
	public AddressBookDTO(String name, String city, String phoneNo) {
		super();
		this.name = name;
		this.city = city;
		this.phoneNo = phoneNo;
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

	@Override
	public String toString() {
		return "AddressBookDTO [name=" + name + ", city=" + city + ", phoneNo=" + phoneNo + "]";
	}
	
	
}
